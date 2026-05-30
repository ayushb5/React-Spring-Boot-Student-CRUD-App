package com.student.service;

import java.util.List;

import com.student.entities.Student;

public interface StudentService {
	Student save(Student student);
	List<Student> getAllStudents();
	Student getStudentById(int id);
	void deleteStudent(int id);
}
