package com.zh.dao;

import com.zh.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> findAll();

    User findById(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);
}
