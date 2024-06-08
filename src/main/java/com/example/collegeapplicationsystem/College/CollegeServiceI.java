package com.example.collegeapplicationsystem.College;

import java.util.List;

public interface CollegeServiceI {
    List<College> findAll();
    College findCollege(Long id);
    void addCollege(College college);
    void remCollege(College college);
}
