package com.example.collegeapplicationsystem.Student;

import com.example.collegeapplicationsystem.College.College;
import com.example.collegeapplicationsystem.DTO.StudentCreation;
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
    public void addStudent(StudentCreation studentCreation) {
        Student student = new Student();
        student.setName(studentCreation.getName());
        student.setAge(studentCreation.getAge());
        student.setGpa(studentCreation.getGpa());
        student.setSat(studentCreation.getSat());
        List<String> collegeNames = studentCreation.getColleges();
        for (String collegeName : collegeNames) {
            College college = collegeRepository.findByName(collegeName);
            if (college == null) {
                college = new College();
                college.setName(collegeName);
                collegeRepository.save(college);
            }
            student.addCollege(college);
        }
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
