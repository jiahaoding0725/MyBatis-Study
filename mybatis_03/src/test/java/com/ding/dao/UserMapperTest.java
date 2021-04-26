package com.ding.dao;

import com.ding.pojo.User;
import com.ding.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserMapperTest {

    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    //select * from mybatis.user where id = #{id}
    //select id, name, pwd from mybatis.user where id = #{id}

}


