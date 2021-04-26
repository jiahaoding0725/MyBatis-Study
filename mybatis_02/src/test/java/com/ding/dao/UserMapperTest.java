package com.ding.dao;

import com.ding.pojo.User;
import com.ding.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void test() {
        // 第一步：获得SqlSession对象
        SqlSession sqlSession =  MybatisUtils.getSqlSession();

        try {
            // 执行SQL
            // 方式一：getMapper (推荐)
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = mapper.getUserList();
            // 方式二:
            // List<User> userList = sqlSession.selectList("com.ding.dao.UserDao.getUserList");
            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭SqlSession
            sqlSession.close();
        }
    }

    @Test
    public void getUserByLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> userList = mapper.getUserLike("李");
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

}
