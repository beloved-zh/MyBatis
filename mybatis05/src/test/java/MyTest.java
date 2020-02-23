import com.zh.dao.StudentMapper;
import com.zh.dao.TeacherMapper;
import com.zh.pojo.Student;
import com.zh.pojo.Teacher;
import com.zh.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {

    public static void main(String[] args) {

        SqlSession sqlSession = MybatisUtil.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        Teacher teacher = mapper.findById(1);

        System.out.println(teacher);

        sqlSession.close();

    }


    @Test
    public void findAllStuAndTea(){

        SqlSession sqlSession = MybatisUtil.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> list = mapper.findAllStuAndTea();

        for (Student student : list) {
            System.out.println(student);
        }

        sqlSession.close();
    }

    @Test
    public void findAllStuAndTea2(){

        SqlSession sqlSession = MybatisUtil.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> list = mapper.findAllStuAndTea2();

        for (Student student : list) {
            System.out.println(student);
        }

        sqlSession.close();
    }

}
