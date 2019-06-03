package com.test;

import com.entity.Student;
import com.service.IStudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        此处需要getBean，Service层和Dao(Mapper)层都需要加上注解，并且applicationContext.xml中需要设置default-autowire和context:component-scan
        IStudentService studentService = (IStudentService) context.getBean("studentService");
        Student student = new Student(10010,"小啊","男",2);
        studentService.addStudent(student);
        System.out.println("添加成功！！！");
    }
}
