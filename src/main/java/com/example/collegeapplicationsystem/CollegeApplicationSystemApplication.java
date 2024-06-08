package com.example.collegeapplicationsystem;

import com.example.collegeapplicationsystem.College.College;
import com.example.collegeapplicationsystem.College.CollegeService;
import com.example.collegeapplicationsystem.Student.Student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

import static org.hibernate.internal.util.collections.CollectionHelper.set;

@SpringBootApplication
public class CollegeApplicationSystemApplication {

    private static final Logger log = LoggerFactory.getLogger(CollegeApplicationSystemApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(CollegeApplicationSystemApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(CollegeService collegeService){
        return args -> {
            Student student = new Student(1, "Sanjay", 20, 4.4, 1520);
            log.info("Run: " + student);

            String filePath = "src/main/resources/docs/colleges";

            collegeService.addCollegesFromTxtFile(filePath);
        };
    }


}
