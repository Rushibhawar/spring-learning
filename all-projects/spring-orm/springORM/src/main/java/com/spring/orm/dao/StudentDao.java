package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {
	
	/*various methods HibernateTemplate has are save(Object entity),saveOrUpdate(Object entity), update(Object entity),
	 * delete(Object entity),get(Class entityClass, Serializable id), load(Class entityClass, Serializable id), loadAll(Class entityClass)
	 * */
	private HibernateTemplate hibernateTemplate;
	
	//save student
	@Transactional // to enable write operation and also add tx schema inside config.xml
	public int insert(Student student) {
		
		int res = (Integer)this.hibernateTemplate.save(student); // to insert which internally calls hibernate session.save method
		
		return res;
		
	}

	
	//get single data(object) 
	//when we get we do not need transaction 
	public Student getStudent(int studentId) {
	Student student = this.hibernateTemplate.get(Student.class, studentId);
		
		return student;
		
	}
	
	//get All Students
	public List<Student> getAllStudents(){
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		
		return students;
		
	}
	
	//delete student
	@Transactional
	public void deleteStudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
	}
	
	
	//Update the columns
	@Transactional
	public void updateStudent(int studentId,String studentName, String studentCity) {
		Student student = new Student(studentId, studentName, studentCity);
		this.hibernateTemplate.update(student);
	}
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}
