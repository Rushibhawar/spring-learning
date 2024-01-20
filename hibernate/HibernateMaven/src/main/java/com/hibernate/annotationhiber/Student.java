package com.hibernate.annotationhiber;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.jboss.jandex.TypeTarget.Usage;

 //this annotation tells the hibernate that this class is an entity i.e we create a class for every table normal but here we do not
@Entity(name = "Student") // we can change the entity name from class name i.e Student to as we prefer i.e @Entity(name="student_details")
@Cacheable // for second level cache
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Student {
	
	@Id  // this means we have declared studentId as primary key
	private int studentId;
	
	private String studentName;
	private String studentCity;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, String studentCity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCity=" + studentCity
				+ "]";
	}
	
	
	
}
