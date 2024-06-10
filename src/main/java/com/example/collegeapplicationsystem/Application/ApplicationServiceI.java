package com.example.collegeapplicationsystem.Application;


import java.util.List;

public interface ApplicationServiceI {

    List<Application> findAll();

    void makeApplication(Application application);
}
