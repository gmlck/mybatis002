package com.gml.learn.mybatis002.mapper;

import com.gml.learn.mybatis002.po.Orders;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author minglug
 * @date 2016/12/21
 */
public class OrdersMapperTest {
    SqlSessionFactory sqlSessionFactory;
    SqlSession sqlSession;
    OrdersMapper ordersMapper;
    @Before
    public void setUp() throws Exception {
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
        sqlSession = sqlSessionFactory.openSession();
        ordersMapper = sqlSession.getMapper(OrdersMapper.class);
    }

    @After
    public void tearDown() throws Exception {
        sqlSession.close();
    }

    @Test
    public void findOrders() throws Exception {
        Orders orders = ordersMapper.findOrders(3);
        System.out.println(orders);
    }

    @Test
    public void findOrdersDetail() throws Exception {
        Orders orders = ordersMapper.findOrdersDetail(3);
       /* for (Orders o : orders) {
            System.out.println(o);
        }*/
        System.out.println(orders);
    }
}