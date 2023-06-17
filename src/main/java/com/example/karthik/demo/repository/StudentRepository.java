package com.example.karthik.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.karthik.demo.entity.StudentDTO;

@Repository
public interface StudentRepository extends CrudRepository<StudentDTO,String> {
    
}
