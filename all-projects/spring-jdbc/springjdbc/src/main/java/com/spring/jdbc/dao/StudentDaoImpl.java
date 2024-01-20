package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		// TODO Auto-generated method stub
		/*insert query*/
    	String  query = "INSERT INTO student(student_id,student_name,student_city) VALUES (?,?,?)";
		
    	/*execute the query
    	 * here in update first we have to mention the query and then the dynamic values
    	 * */
    	int result = this.jdbcTemplate.update(query,student.getStudentId(),student.getStudentName(),student.getStudentCity());
    	
    	return result;
	}

	//update method
	public int updateDetails(Student student) {
		// TODO Auto-generated method stub
		
		String query = "UPDATE student SET student_name = ?, student_city = ? WHERE student_id = ?";
		
		int result = this.jdbcTemplate.update(query,student.getStudentName(),student.getStudentCity(),student.getStudentId());
		
		return result;
	}


	public int deleteDetails(int studentId) {
		// TODO Auto-generated method stub
		
		String query = "DELETE FROM student WHERE student_id = ?";
		
		int r = this.jdbcTemplate.update(query,studentId);
		
		return r;
	}

	//single object selecting single student data
	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
		
		String query = "SELECT * FROM student WHERE student_id = ?";
		
		//rowMapper object
		
		RowMapper<Student> rowMapper = new RowMapperImpl();
		
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
		
		
		return student;
	}

	/*selecting multiple student*/
	public List<Student> gettAllStudents() {
		// TODO Auto-generated method stub
		
		String query = "SELECT * FROM student";
		
		RowMapper<Student> rowMapper = new RowMapperImpl();
		
		List<Student> studentList = this.jdbcTemplate.query(query, rowMapper);
		
		return studentList;
	}

	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
}
