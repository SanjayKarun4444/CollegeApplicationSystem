package com.example.collegeapplicationsystem.Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/applications")
public class ApplicationController {


    @Autowired
    private ApplicationService applicationService;

    @GetMapping("")
    List<Application> findAll(){
        return applicationService.findAll();
    }

    @PostMapping("/create")
    void makeApplication(@RequestBody Application application){
        applicationService.makeApplication(application);
    }

}
