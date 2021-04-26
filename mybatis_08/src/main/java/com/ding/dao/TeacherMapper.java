package com.ding.dao;

import com.ding.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    //List<Teacher> getTeacher();

    //获取指定老师下的所有学生及老师的信息
    Teacher getTeacher(@Param("tid") int id);

    //获取指定老师下的所有学生及老师的信息
    Teacher getTeacher2(@Param("tid") int id);

}
