package com.ding.dao;

import com.ding.pojo.Student;

import java.util.List;

public interface StudentMapper {

    //查询所有的学生信息，以及对应的老师信息
    List<Student> getStudent();

    List<Student> getStudent2();
}