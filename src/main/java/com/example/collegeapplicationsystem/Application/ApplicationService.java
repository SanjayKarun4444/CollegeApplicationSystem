package com.example.collegeapplicationsystem.Application;

import com.example.collegeapplicationsystem.College.College;
import com.example.collegeapplicationsystem.Student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService implements ApplicationServiceI {

    @Autowired
    ApplicationRepository applicationRepository;

    @Override
    public List<Application> findAll() {
        return applicationRepository.findAll();
    }

    @Override
    public void makeApplication(Application application) {
        applicationRepository.save(application);
    }
}
