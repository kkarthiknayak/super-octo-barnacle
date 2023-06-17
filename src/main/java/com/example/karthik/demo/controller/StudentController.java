package com.example.karthik.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.karthik.demo.model.Student;
import com.example.karthik.demo.service.StudentService;

@RequestMapping(path = "/students")
@RestController
public class StudentController {
    
    @Autowired
    private StudentService studentService;


    @PostMapping
    public Student saveStudent(@RequestBody Student student){   
        return studentService.saveStudent(student);
    }
    
}
