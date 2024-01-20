package com.hibernate.embedable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "student1") // we can change the entity name from class name i.e Student to as we prefer i.e @Entity(name="student_details")
public class Student1 {
	
	@Id  // this means we have declared studentId as primary key
	private int studentId;
	
	private String studentName;
	private String studentCity;
	
	@Embedded //@Embedded is used to embed a type into another entity.
	private Certificate cerificate;
	
	
	/*And if the attributes override then use this annotation for the particular attributes
	 * @Embedded
		@AttributeOverrides({
		  @AttributeOverride( name = "firstName", column = @Column(name = "contact_first_name")),
		  @AttributeOverride( name = "lastName", column = @Column(name = "contact_last_name")),
		  @AttributeOverride( name = "phone", column = @Column(name = "contact_phone"))
		})
		private ContactPerson contactPerson;
	 * */
	
	
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student1(int studentId, String studentName, String studentCity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}
	
	
	
	public Student1(int studentId, String studentName, String studentCity, Certificate cerificate) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
		this.cerificate = cerificate;
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
	
	
	
	public Certificate getCerificate() {
		return cerificate;
	}
	public void setCerificate(Certificate cerificate) {
		this.cerificate = cerificate;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCity=" + studentCity
				+ ", cerificate=" + cerificate + "]";
	}
	
	
	
	
}