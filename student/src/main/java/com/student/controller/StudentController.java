package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.dto.StudentDto;
import com.student.entities.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
	@Autowired
	private StudentService service;
	
	@PostMapping
	public ResponseEntity<Student> save(@RequestBody StudentDto dto){
		Student student=new Student();
		
		student.setName(dto.getName());
		student.setAge(dto.getAge());
		student.setEmail(dto.getEmail());
		student.setMobileno(dto.getMobileno());
		student.setMarks(dto.getMarks());
		
		Student savedStudent=service.save(student);
		return new ResponseEntity<>(savedStudent,HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Student>> getAllStudents(){
		List<Student> students=service.getAllStudents();
		return new ResponseEntity<>(students,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") int id){
		Student student=service.getStudentById(id);
		return new ResponseEntity<>(student,HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Student> updateStudentById(@PathVariable("id") int id,@RequestBody StudentDto dto){
		Student student=service.getStudentById(id);
		student.setName(dto.getName());
		student.setAge(dto.getAge());
		student.setEmail(dto.getEmail());
		student.setMobileno(dto.getMobileno());
		student.setMarks(dto.getMarks());
		
		Student updatedStudent=service.save(student);
		return new ResponseEntity<>(updatedStudent,HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteStudentById(@PathVariable("id") int id){
		service.deleteStudent(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
