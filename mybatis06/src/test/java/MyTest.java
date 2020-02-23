import com.zh.dao.TeacherMapper;
import com.zh.pojo.Teacher;
import com.zh.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

public class MyTest {

    public static void main(String[] args) {

        SqlSession sqlSession = MybatisUtil.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        Teacher teacher = mapper.findById2(1);

        System.out.println(teacher);

        sqlSession.close();

    }
}
