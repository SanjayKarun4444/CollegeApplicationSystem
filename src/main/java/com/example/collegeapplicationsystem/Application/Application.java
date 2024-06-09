package com.example.collegeapplicationsystem.Application;

import com.example.collegeapplicationsystem.Student.Student;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Student student;
    private String question1;
    private String question2;

    public Application() {
    }

    public Application(Long id, Student student, String question1, String question2) {
        this.id = id;
        this.student = student;
        this.question1 = question1;
        this.question2 = question2;
    }

    public Application(Long id, Student student) {
        this.id = id;
        this.student = student;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getQuestion1() {
        return question1;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    public String getQuestion2() {
        return question2;
    }

    public void setQuestion2(String question2) {
        this.question2 = question2;
    }
}
