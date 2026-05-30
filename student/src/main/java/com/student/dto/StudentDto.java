package com.student.dto;

public class StudentDto {
	private String name;
	private int age;
	private String email;
	private String mobileno;
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public StudentDto(String name, int age, String email, String mobileno, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.mobileno = mobileno;
		this.marks = marks;
	}
	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
