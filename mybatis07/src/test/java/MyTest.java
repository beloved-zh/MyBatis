import com.zh.dao.BlogMapper;
import com.zh.pojo.Blog;
import com.zh.utils.MybatisUtil;
import com.zh.utils.UUIDUtis;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MyTest {

    @Test
    public void addBlog(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(UUIDUtis.getUUID());
        blog.setTitle("Mybatisrumen");
        blog.setAuthor("张恒");
        blog.setCreateTime(new Date());
        blog.setViews(1200);

        mapper.addBlog(blog);

        blog.setId(UUIDUtis.getUUID());
        blog.setTitle("java入门");
        mapper.addBlog(blog);

        blog.setId(UUIDUtis.getUUID());
        blog.setTitle("sql入门");
        mapper.addBlog(blog);

        blog.setId(UUIDUtis.getUUID());
        blog.setTitle("html入门");
        mapper.addBlog(blog);

        blog.setId(UUIDUtis.getUUID());
        blog.setTitle("css入门");
        mapper.addBlog(blog);


        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateBlog(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap<String, String> map = new HashMap<String, String>();

        map.put("id","237e70fa7aa243568905892d65bc34ed");
//        map.put("title","Mybatis入门2");
        map.put("author","张恒2");

        mapper.updateBlog(map);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void findByChoose(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap<String, String> map = new HashMap<String, String>();

        map.put("id","868010e884d948b292402bed9544df4d");
        map.put("title","css入门");


        List<Blog> list = mapper.findByChoose(map);

        for (Blog blog : list) {
            System.out.println(blog);
        }


        sqlSession.close();
    }

    @Test
    public void findByIF(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap<String, String> map = new HashMap<String, String>();

        map.put("id","868010e884d948b292402bed9544df4d");
        map.put("title","css入门");


        List<Blog> list = mapper.findByIF(map);

        for (Blog blog : list) {
            System.out.println(blog);
        }


        sqlSession.close();
    }


    @Test
    public void findBlogByFoeEach(){

        SqlSession sqlSession = MybatisUtil.getSqlSession();

        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();

        ArrayList<Integer> ids = new ArrayList<Integer>();

        ids.add(1);
        ids.add(2);
        ids.add(3);

        map.put("ids",ids);
        map.put("author","张恒");

        List<Blog> list = mapper.findBlogByFoeEach(map);

        for (Blog blog : list) {
            System.out.println(blog);
        }

        sqlSession.close();
    }
}































