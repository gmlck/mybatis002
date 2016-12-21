package com.gml.learn.mybatis002.mapper;

import com.gml.learn.mybatis002.po.Orders;
import com.gml.learn.mybatis002.po.User;
import com.gml.learn.mybatis002.vo.UserCustom;
import com.gml.learn.mybatis002.vo.UserQueryVo;
import org.springframework.core.annotation.Order;

import java.util.List;

/**
 * @author minglug
 * @date 2016/12/21
 */
public interface UserMapper {
    /**
     * 根据ID号查询用户信息
     * @param id 用户ID
     * @return 用户信息
     */
    User findUserById(int id);

    /**
     * 根据用户组合条件高级查询，返回满足条件的用户列表
     * @param UserQueryVo 用户查询条件封装类
     * @return 用户信息列表
     */
    List<UserCustom> findUser(UserQueryVo userQueryVo);

    /**
     * 根据用户组合条件高级查询，返回满足条件的总数
     * @param userQueryVo 用户查询条件封装类
     * @return 满足条件的总数
     */
    int findUserCount(UserQueryVo userQueryVo);

    /**
     * 根据用户组合条件高级查询，返回指定用户的订单信息
     * @param userQueryVo  用户查询条件封装类
     * @return 满足条件的用户订单信息
     */
    List<User> findUserOrders(UserQueryVo userQueryVo);
}
