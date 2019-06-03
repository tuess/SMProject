package com.service.impl;

import com.entity.Student;
import com.mapper.StudentMapper;
import com.service.IStudentService;
import org.springframework.stereotype.Component;

@Component("studentService")
public class StudentServiceImpl implements IStudentService {
    private StudentMapper studentMapper;

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }
    @Override
    public void addStudent(Student student) {
//        调用dao层
        studentMapper.addStudent(student);
    }
}
