package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

/*RowMapper maps the Query results to the Java object*/

public class RowMapperImpl implements RowMapper<Student>{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		student.setStudentId(rs.getInt(1));
		student.setStudentName(rs.getString(2));
		student.setStudentCity(rs.getString(3));
		
		return student;
	}

}
