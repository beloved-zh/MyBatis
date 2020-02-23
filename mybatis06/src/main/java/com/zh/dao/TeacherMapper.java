package com.zh.dao;

import com.zh.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {

    //获取指定老师下的所有学生及老师信息
    Teacher findById(@Param("tid") int id);
    Teacher findById2(@Param("tid") int id);

}
