package com.example.collegeapplicationsystem.Application;

import com.example.collegeapplicationsystem.College.College;
import com.example.collegeapplicationsystem.Student.Student;
import jakarta.persistence.*;

public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "college_id")
    private College college;
    private String question1;
    private String question2;

    public Application() {
    }

    public Application(Long id, Student student, College college, String question1, String question2) {
        this.id = id;
        this.student = student;
        this.college = college;
        this.question1 = question1;
        this.question2 = question2;
    }

    public Application(Long id, Student student, College college) {
        this.id = id;
        this.student = student;
        this.college = college;
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
