package com.example.karthik.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.karthik.demo.entity.StudentDTO;
import com.example.karthik.demo.model.Student;
import com.example.karthik.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {  
        StudentDTO studentDTO = studentRepository.save(new StudentDTO(student.email(),student.name(),student.phoneNumber()));
        return new Student(studentDTO.getEmail(),studentDTO.getName(), studentDTO.getPhoneNumber()); 
    }
    
}
