package com.example.collegeapplicationsystem.College;

import com.example.collegeapplicationsystem.Student.Student;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String name;

//    @ManyToMany(mappedBy = "colleges")
//    private Set<Student> students = new HashSet<>();
//
//    public Set<Student> getStudents(){
//        return students;
//    }


    public College(Long id, String names) {
        this.id = id;
        this.name = name;
    }

    public College(String name) {
        this.name = name;
    }

    public College() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}