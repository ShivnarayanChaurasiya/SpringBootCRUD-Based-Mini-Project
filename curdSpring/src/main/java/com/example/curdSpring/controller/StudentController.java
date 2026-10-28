package com.example.curdSpring.controller;

import com.example.curdSpring.entity.Student;
import com.example.curdSpring.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

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

     public ResponseEntity<Student> createStudent(
             @RequestBody Student student) {

         Student createdStudent  = studentService.createStudent(student);

       return  ResponseEntity
               .status(HttpStatus.CREATED)
               .body(createdStudent);





}
// read student
@GetMapping("/get")
    public  ResponseEntity<Student> getStudents(@PathVariable Long id) {
      Student studentResp = studentService.getStudent(id);
      return ResponseEntity.ok(studentResp);
   }

    // update student

    // delete student

}
