package com.example.collegeapplicationsystem.Student;

import com.example.collegeapplicationsystem.DTO.StudentCreation;

import java.util.ArrayList;

public interface StudentServiceI {
    ArrayList<Student> findAll();
    void addStudent(StudentCreation studentCreation);

    void deleteStudent(long id);
}
