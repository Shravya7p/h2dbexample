package com.h2dbexample.h2dbexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.h2dbexample.h2dbexample.entity.Student;
import com.h2dbexample.h2dbexample.services.StudentService;
@RestController
public class StudentRController {
	
	@Autowired
	private StudentService stService;
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello World!!";
	}
   
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudents(){
		return ResponseEntity.ok(this.stService.getAllStudents());
	}
	
	@PostMapping("/createStudent")
	public ResponseEntity<Void> createStudent(@RequestBody Student st){
		Student student = this.stService.createStudent(st);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
