package com.example.curdSpring.service;

import com.example.curdSpring.entity.Student;
import com.example.curdSpring.repository.StudentRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentRepository studentRepository;
     public StudentService(StudentRepository studentRepository){
         this.studentRepository = studentRepository;
     }

     public Student createStudent(Student studentReq){
         // business logic
         // store dbudent
        //  System.out.println("Inside student Service ");
         Student studentResp = studentRepository.save(studentReq);
        //  System.out.println("Exiting  student Service ");
         return studentResp;
     }

     public Student getStudent(Long id){
         Student studentResp = studentRepository.getOne(id);
     }

    // 1. End point listen (/app/students POST)

     // 2. Business logic

    // 3. Interact with DB to store

    //4. Response back to client (postman)
}
