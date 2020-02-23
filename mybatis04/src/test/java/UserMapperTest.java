import com.zh.dao.UserMapper;
import com.zh.pojo.User;
import com.zh.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public void delete(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //底层主要应用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.delete(5);

        sqlSession.close();
    }

    @Test
    public void update(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //底层主要应用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.update(new User(5,"aaaa","admin"));

        sqlSession.close();
    }

    @Test
    public void add(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //底层主要应用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.addUser(new User(5,"admin","admin"));

        sqlSession.close();
    }

    @Test
    public void findById(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //底层主要应用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.findById(1);

        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void findAll(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //底层主要应用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> list = mapper.findAll();

        for (User user : list) {
            System.out.println(user);
        }

        sqlSession.close();
    }

}
