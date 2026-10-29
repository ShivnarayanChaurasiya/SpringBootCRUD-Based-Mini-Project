package com.example.curdSpring.controller;

import com.example.curdSpring.entity.Student;
import com.example.curdSpring.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

 @GetMapping("/get/{id}")
    public  ResponseEntity<Student> getAllStudents(@PathVariable Long id) {
      Student studentResp = studentService.getStudent(id);

      if (studentResp == null) {
         return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);

      }
      return ResponseEntity.ok(studentResp);
   }
   // read all student data

    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getAllStudents() {
       List<Student> studentList= studentService.getAllStudent();

       if (studentList.isEmpty()){
           return ResponseEntity.notFound().build();
       }
       return ResponseEntity.ok(studentList);
    }

    // update student
    @PutMapping("/update/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id , @RequestBody Student studentReq) {
       Student studentResp = studentService.updateStudent(id , studentReq);

        if (studentResp == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return  ResponseEntity.ok(studentResp);

    }

    // delete student

}
