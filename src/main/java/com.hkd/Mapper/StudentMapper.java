package com.hkd.Mapper;

import com.hkd.Pojo.Student;

import java.util.List;

/**
 * @author jhj
 * @data 2021/8/1 - 19:52
 */
public interface StudentMapper {
    public void insertStudent(Student student);
    public List<Student> getStudent();
}
