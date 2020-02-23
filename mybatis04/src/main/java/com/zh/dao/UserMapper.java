package com.zh.dao;

import com.zh.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    List<User> findAll();

    //方法有多个基本参数，所有参数前必须加上@Param()注解,引用对象不需要
    @Select("select * from user where id = #{id}")
    User findById(@Param("id") int id);


    @Insert("insert into user(id,name,pwd) values(#{id},#{name},#{pwd})")
    int addUser(User user);

    @Update("update user set name=#{name} where id = #{id}")
    int update(User user);

    @Delete("delete from user where id = #{uid}")
    int delete(@Param("uid") int id);
}
