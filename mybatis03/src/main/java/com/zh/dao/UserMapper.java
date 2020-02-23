package com.zh.dao;

import com.zh.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    User findById(int id);

    //分页
    List<User> findByLimit(Map<String,Integer> map);

    //分页2
    List<User> findByRowBounds();

}
