package com.example.collegeapplicationsystem.Student;

import java.util.ArrayList;

public interface StudentServiceI {
    ArrayList<Student> findAll();
    void addStudent(Student student);

    void deleteStudent(long id);
}
