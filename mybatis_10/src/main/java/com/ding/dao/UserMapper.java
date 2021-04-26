package com.ding.dao;

import com.ding.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    //根据id查询用户
    User queryUserById(@Param("id") int id);

    int updateUser(User user);
}
