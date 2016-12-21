package com.gml.learn.mybatis002.mapper;

import com.gml.learn.mybatis002.po.Orders;

import java.util.List;

/**
 * @author minglug
 * @date 2016/12/21
 */
public interface OrdersMapper {
    /**
     * 根据订单ID查询，返回订单信息
     * @param id 订单ID
     * @return 订单信息
     */
    Orders findOrders(int id);

    /**
     * 根据订单ID查询，返回订单及订单详细信息列表
     * @param id 订单ID
     * @return 订单及订单详细信息列表
     */
    Orders findOrdersDetail(int id);
}
