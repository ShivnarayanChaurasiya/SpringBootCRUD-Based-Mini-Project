package com.example.curdSpring.repository;

import com.example.curdSpring.entity.Student;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

//@Component
// @Registered
public interface  StudentRepository extends JpaRepository<Student ,Long> {







 // save to db

       //   Dummy data
//        System.out.println("Inside student repository ");
//        System.out.println("Exiting student Repository");
//        Student s1 = new Student();
//        s1.setName("aditya");
//        s1.setAge(25);
//        s1.setEmail("amit@gmil.com");
//        s1.setRollNo(101);
//        s1.setSubject("spring Boot");
//        return s1;




}
