package com.example.collegeapplicationsystem.DTO;

import java.util.List;

public class StudentCreation {
    private int id;
    private String name;
    private Integer age;
    private Double gpa;
    private Integer sat;
    private List<String> colleges;

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

    public List<String> getColleges() {
        return colleges;
    }

    public void setColleges(List<String> colleges) {
        this.colleges = colleges;
    }
}
