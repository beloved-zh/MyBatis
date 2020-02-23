import com.zh.dao.UserMapper;
import com.zh.pojo.User;
import com.zh.utils.MybatisUtil;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {

    static Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void findByRowBounds(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        //RowBounds分页
        RowBounds rowBounds = new RowBounds(1, 2);

        //通过java代码实现分页
        List<User> list = sqlSession.selectList("com.zh.dao.UserMapper.findByRowBounds",null,rowBounds);

        for (User user : list) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void findByLimit(){

        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex",1);
        map.put("pageSize",2);

        List<User> list = mapper.findByLimit(map);

        for (User user : list) {
            System.out.println(user);
        }

        sqlSession.close();

    }

    @Test
    public void findById(){
        logger.info("info:进入findById方法");

        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper dao = sqlSession.getMapper(UserMapper.class);

        User user = dao.findById(1);

        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void testLog4j(){
        //提示信息
        logger.info("info:进入testLog4j方法");
        //调式
        logger.debug("debug:进入testLog4j方法");
        //严重：紧急错误
        logger.error("error:进入testLog4j方法");
    }
}














