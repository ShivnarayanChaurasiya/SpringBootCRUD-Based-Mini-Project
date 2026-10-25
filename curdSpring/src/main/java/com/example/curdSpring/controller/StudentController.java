package com.example.curdSpring.controller;

import com.example.curdSpring.entity.Student;
import com.example.curdSpring.service.StudentService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {
   private StudentService studentService;

   public StudentController(StudentService studentService) {
       this.studentService = studentService;
   }

    //create student
    // @PostMapping
     @PostMapping("/create")
public String createStudent(@RequestBody Student student){
         System.out.println("Inside student controller ");
         Student createStudent  = studentService.createStudent(student);
         System.out.println("Exiting  student controller ");
       return "Student created";


//         System.out.println(student.getName());
//         System.out.println(student.getEmail());


}
// read student

    // update student

    // delete student

}
