package com.example.collegeapplicationsystem.College;

import ch.qos.logback.core.model.Model;
import com.example.collegeapplicationsystem.Student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/colleges")
public class CollegeController {
    private final CollegeRepository collegeRepository;

    @Autowired
    public CollegeController(CollegeRepository repository){
        this.collegeRepository = repository;
    }

    @PostMapping("/add")
    public College addCollege(@RequestBody College college) {
        return collegeRepository.save(college);
    }

    @GetMapping("")
    public ResponseEntity<List<College>> findAll() {
        List<College> allColleges = collegeRepository.findAll();
        return ResponseEntity.ok(allColleges);
    }

}
