package com.zh.dao;

import com.zh.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User findById(@Param("id") int id);

    int update(User user);

}
