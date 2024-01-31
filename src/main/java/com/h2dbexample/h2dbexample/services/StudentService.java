package com.h2dbexample.h2dbexample.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h2dbexample.h2dbexample.repository.StudentRepository;
import com.h2dbexample.h2dbexample.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepo;
	
	public List<Student> getAllStudents(){
		
		List<Student> st = new ArrayList<>();
		studentRepo.findAll().forEach(student -> st.add(student));
		return st;
	}
	
	public Student createStudent(Student st) {
		Student stud = this.studentRepo.save(st);
		return stud;
		
	}

}

