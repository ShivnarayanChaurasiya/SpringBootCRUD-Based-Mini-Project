package com.example.curdSpring.service;

import com.example.curdSpring.entity.Student;
import com.example.curdSpring.repository.StudentRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
          Optional<Student> studentResp = studentRepository.findById(id);
          if(studentResp.isPresent()){
              return studentResp.get();
          }
          return null ;
     }
     public List<Student> getAllStudent(){
         List<Student> studentList = studentRepository.findAll();
         return studentList;
     }

    public Student updateStudent(Long id , Student studentReq ) {
        Optional<Student> exitstingStudent= studentRepository.findById(id);
        if (exitstingStudent.isEmpty()) {

            return null;
        }
        Student studentToSave = exitstingStudent.get();

        studentToSave.setName(studentReq.getName());
        studentToSave.setAge(studentReq.getAge());
            studentToSave.setRollNo(studentReq.getRollNo());
            studentToSave.setSubject(studentReq.getSubject());
            studentToSave.setEmail(studentReq.getEmail());
            return studentRepository.save(studentToSave);
    }

    public Boolean deleteStudent(Long id ){
         Boolean isStudent = studentRepository.existsById(id);
         if (!isStudent) {
             return false;
         }
         studentRepository.deleteById(id);
         return true;

    }
    // 1. End point listen (/app/students POST)

     // 2. Business logic

    // 3. Interact with DB to store

    //4. Response back to client (postman)
}
