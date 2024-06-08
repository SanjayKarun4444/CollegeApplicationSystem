package com.example.collegeapplicationsystem.Student;

import com.example.collegeapplicationsystem.College.College;
import jakarta.persistence.*;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
public class Student {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String name;
        private Integer age;
        private Double gpa;
        private Integer sat;
        @ManyToMany
        @JoinTable(
                name = "student_colleges",
                joinColumns = @JoinColumn(name = "student_id"),
                inverseJoinColumns = @JoinColumn(name="college_id")
        )
        private Set<College> colleges = new HashSet<>();


        public void addCollege(College college){
                this.colleges.add(college);
                //colleges.getStudents().add(college);
        }
        public Student() {
        }

        public Student(int id, String name, Integer age, Double gpa, Integer sat){//, List<College> colleges) {
                this.id = id;
                this.name = name;
                this.age = age;
                this.gpa = gpa;
                this.sat = sat;
                //this.colleges = colleges;
        }

        public Set<College> getColleges() {
                return colleges;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public Integer getAge() {
                return age;
        }

        public void setAge(Integer age) {
                this.age = age;
        }

        public Double getGpa() {
                return gpa;
        }

        public void setGpa(Double gpa) {
                this.gpa = gpa;
        }

        public Integer getSat() {
                return sat;
        }

        public void setSat(Integer sat) {
                this.sat = sat;
        }

//        public List<College> getColleges() {
//                return colleges;
//        }
//
//        public void setColleges(List<College> colleges) {
//                this.colleges = colleges;
//        }
}