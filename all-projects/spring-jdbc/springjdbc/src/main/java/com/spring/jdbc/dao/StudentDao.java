package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entities.Student;

public interface StudentDao {
	public int insert(Student student);
	
	public int updateDetails(Student student);
	
	public int deleteDetails(int studentId);
	
	//single object
	public Student getStudent(int studentId);
	
	//multiple objects
	public List<Student> gettAllStudents();
}
