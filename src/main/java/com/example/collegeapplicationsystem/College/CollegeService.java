package com.example.collegeapplicationsystem.College;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


@Service
public class CollegeService implements CollegeServiceI {

    List<College> colleges = new ArrayList<>();

    @Autowired
    CollegeRepository collegeRepository;

    public void addCollegesFromTxtFile(String filePath){
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = br.readLine()) != null){
                College college = new College(line.trim());
                collegeRepository.save(college);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<College> findAll() {
        if(colleges.isEmpty()) return null;
        return colleges;
    }

    @Override
    public College findCollege(Long id) {
        College college = colleges.stream().filter(college1 -> college1.getId() == id).findAny().orElse(null);
        return college;
    }

    @Override
    public void addCollege(College college) {
        colleges.add(college);
    }

    @Override
    public void remCollege(College college) {
        colleges.remove(college);
    }
}
