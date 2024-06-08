package com.example.collegeapplicationsystem.Student;

import com.example.collegeapplicationsystem.College.College;
import com.example.collegeapplicationsystem.DTO.CollegeRegistrationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class AppController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @GetMapping("")
    ArrayList<Student> findAll(){
        return studentService.findAll();
    }

    @DeleteMapping("/delete/{studentId}")
    void deleteStudent(@PathVariable long studentId){
        studentService.deleteStudent(studentId);
    }

    @PostMapping("/addCollege")
    void addCollege(@RequestBody CollegeRegistrationRequest request){
        studentService.addCollegeToStudent(request.getStudentId(), request.getCollegeId());
    }



}
