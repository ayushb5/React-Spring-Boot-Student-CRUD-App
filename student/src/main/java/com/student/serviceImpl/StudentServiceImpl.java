package com.student.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entities.Student;
import com.student.repository.StudentRepository;
import com.student.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository repository;
	
	@Override
	public Student save(Student student) {
		return repository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return repository.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public void deleteStudent(int id) {
		repository.deleteById(id);
	}

}
