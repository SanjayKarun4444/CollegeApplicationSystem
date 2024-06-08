package com.example.collegeapplicationsystem.DTO;

public class CollegeRegistrationRequest {
    private Long studentId;
    private Long collegeId;

    public CollegeRegistrationRequest(){

    }

    public CollegeRegistrationRequest(Long studentId, Long collegeId) {
        this.studentId = studentId;
        this.collegeId = collegeId;
    }


    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Long collegeId) {
        this.collegeId = collegeId;
    }
}

