import com.zh.dao.UserMapper;
import com.zh.pojo.User;
import com.zh.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {

    @Test
    public void FindById(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.findById(1);
        System.out.println(user);

        //手动清理缓存
//        sqlSession.clearCache();

        mapper.update(new User(2,"aaa","bbb"));

        System.out.println("========================");
        User user1 = mapper.findById(1);
        System.out.println(user1);

        System.out.println(user == user1);

        sqlSession.close();
    }

    @Test
    public void test02(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.findById(1);

        System.out.println(user);

        sqlSession.close();
        System.out.println("===============================");
        SqlSession sqlSession2 = MybatisUtil.getSqlSession();

        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);

        User user2 = mapper2.findById(1);

        System.out.println(user2);

        System.out.println(user == user2);

        sqlSession2.close();
    }

}







































