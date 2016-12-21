package com.gml.learn.mybatis002.vo;

import java.util.List;

/**
 * @author minglug
 * @date 2016/12/21
 */
public class UserQueryVo {
    /**
     * 用户查询条件
     */
    private UserCustom userCustom;

    List<Integer> ids;

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public UserCustom getUserCustom() {
        return userCustom;
    }

    public void setUserCustom(UserCustom userCustom) {
        this.userCustom = userCustom;
    }
}
