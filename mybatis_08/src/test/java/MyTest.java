import com.ding.dao.TeacherMapper;
import com.ding.pojo.Teacher;
import com.ding.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {
    @Test
    public void testGetTeacher() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(2);
        System.out.println(teacher);
        sqlSession.close();
    }

    @Test
    public void testGetTeacher2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher2(2);
        System.out.println(teacher);
        sqlSession.close();
    }
}
