package com.example.collegeapplicationsystem.Student;

import com.example.collegeapplicationsystem.College.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.collegeapplicationsystem.College.CollegeRepository;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService implements StudentServiceI{

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    private CollegeRepository collegeRepository;

    @Override
    public ArrayList<Student> findAll(){
        return (ArrayList<Student>) studentRepository.findAll();
    }

    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }


    public void addCollegeToStudent(long studentId, long collegeId){
        Student student = studentRepository.findById(studentId).orElse(null);
        if(student==null) return;


        College college = collegeRepository.findById(collegeId).orElse(null);
        if(college==null) return;


        student.addCollege(college);

        studentRepository.save(student);

    }


}
