package com.gml.learn.mybatis002.mapper;

import com.gml.learn.mybatis002.po.User;
import com.gml.learn.mybatis002.vo.UserCustom;
import com.gml.learn.mybatis002.vo.UserQueryVo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author minglug
 * @date 2016/12/21
 */
public class UserMapperTest {
    SqlSessionFactory sqlSessionFactory;
    SqlSession sqlSession;
    UserMapper userMapper;
    @Before
    public void setUp() throws Exception {
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
        sqlSession = sqlSessionFactory.openSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
    }

    @After
    public void tearDown() throws Exception {
        sqlSession.close();
    }

    @Test
    public void findUserById() throws Exception {
        User user = userMapper.findUserById(1);
        System.out.println(user);
    }

    @Test
    public void findUser() throws Exception {
        UserQueryVo userQueryVo = new UserQueryVo();
        UserCustom userCustom = new UserCustom();
//        userCustom.setId(10);
        userCustom.setUsername("%小明%");
        userCustom.setSex("1");
        List<Integer> ids = new ArrayList<>();
        ids.add(16);
        ids.add(22);
        userQueryVo.setIds(ids);
        userQueryVo.setUserCustom(userCustom);
        List<UserCustom> list = userMapper.findUser(userQueryVo);
        for (UserCustom u : list) {
            System.out.println(u);
        }
    }

    @Test
    public void findUserCount() throws Exception {
        UserQueryVo userQueryVo = new UserQueryVo();
        UserCustom userCustom = new UserCustom();
//        userCustom.setId(10);
//        userCustom.setUsername("%小明%");
        userCustom.setSex("1");
        List<Integer> ids = new ArrayList<>();
//        ids.add(16);
//        ids.add(22);
        userQueryVo.setIds(ids);
        userQueryVo.setUserCustom(userCustom);
        int count = userMapper.findUserCount(userQueryVo);
        System.out.println(count);


    }
}