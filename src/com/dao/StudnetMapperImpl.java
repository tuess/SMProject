package com.dao;

import com.entity.Student;
import com.mapper.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

class StudentMapperImpl extends SqlSessionDaoSupport implements StudentMapper {
    @Override
    public void addStudent(Student student) {
       /* SqlSession session = super.getSqlSession();
        StudentMapper studentDao = session.getMapper(StudentMapper.class);
        studentDao.addStudent(student);*/
    }
}
