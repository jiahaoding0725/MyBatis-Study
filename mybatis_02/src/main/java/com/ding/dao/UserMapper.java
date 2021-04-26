package com.ding.dao;

import com.ding.pojo.User;

import java.util.List;

public interface UserMapper {


    // 查询全部用户
    List<User> getUserList();

    //根据id查询用户
    User getUserById(int id);

    //添加一个用户
    int addUser(User User);

    //修改用户
    int updateUser(User user);

    //删除用户
    int deleteUser(int id);

}
