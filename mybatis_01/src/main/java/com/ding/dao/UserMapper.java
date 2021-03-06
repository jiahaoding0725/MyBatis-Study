package com.ding.dao;

import com.ding.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    List<User> getUserLike(String name);

    // 查询全部用户
    List<User> getUserList();

    //根据id查询用户
    User getUserById(int id);

    User getUserById2(Map<String, Object> map);

    //添加一个用户
    int addUser(User User);

    //万能map
    int addUser2(Map<String, Object> map);

    //修改用户
    int updateUser(User user);

    //删除用户
    int deleteUser(int id);

}
