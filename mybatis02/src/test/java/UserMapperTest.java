import com.zh.dao.UserMapper;
import com.zh.pojo.User;
import com.zh.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public void testSelect(){

        //1.获取sqlSession对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        //方式一：getMapper
        UserMapper dao = sqlSession.getMapper(UserMapper.class);

        List<User> list = dao.findAll();

        //方式二   不推荐使用
//        List<User> list = sqlSession.selectList("com.zh.dao.UserDao.findAll");

        for (User user : list) {
            System.out.println(user);
        }

        //关闭sqlSession
        sqlSession.close();

    }
}














