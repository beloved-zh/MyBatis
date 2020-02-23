package com.zh.dao;

import com.zh.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    //插入数据
    int addBlog(Blog blog);

    //查询
    List<Blog> findByIF(Map map);

    List<Blog> findByChoose(Map map);

    //更新博客
    int updateBlog(Map map);

    List<Blog> findBlogByFoeEach(Map map);

}
