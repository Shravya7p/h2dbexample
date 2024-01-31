package com.h2dbexample.h2dbexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.h2dbexample.h2dbexample.entity.Student;
public interface StudentRepository extends JpaRepository<Student,Integer>{
    
}
