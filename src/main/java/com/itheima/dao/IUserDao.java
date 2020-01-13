package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

/**
 * @Author Wang5230
 **/
public interface IUserDao {
    /**
     * 查询所有操作
     * @return
     */
    List<User> findAll();
}
