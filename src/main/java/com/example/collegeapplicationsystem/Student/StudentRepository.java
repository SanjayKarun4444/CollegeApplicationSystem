package com.example.collegeapplicationsystem.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    ArrayList<Student> findAll();

}
