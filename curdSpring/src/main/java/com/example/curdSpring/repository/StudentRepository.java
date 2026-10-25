package com.example.curdSpring.repository;

import com.example.curdSpring.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository {
    public Student saveStudent(Student studentReq){
 // save to db
        System.out.println("Inside student repository ");
        System.out.println("Exiting student Repository");
        Student s1 = new Student();
        s1.setName("aditya");
        s1.setAge(25);
        s1.setEmail("amit@gmil.com");
        s1.setRollNo(101);
        s1.setSubject("spring Boot");
        return s1;

    }


}
