package com.hibernate.objectstates;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentData {
	@Id  // this means we have declared studentId as primary key
	private int studentId;
	
	private String studentName;
	private String studentCity;
	
	@Embedded
	private StudentCertificate certificate;
	public StudentData(int studentId, String studentName, String studentCity, StudentCertificate certificate) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
		this.certificate = certificate;
	}
	public StudentData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentData(int studentId, String studentName, String studentCity) {
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
	
	public StudentCertificate getCertificate() {
		return certificate;
	}
	public void setCertificate(StudentCertificate certificate) {
		this.certificate = certificate;
	}
	@Override
	public String toString() {
		return "StudentData [studentId=" + studentId + ", studentName=" + studentName + ", studentCity=" + studentCity
				+ ", certificate=" + certificate + "]";
	}
	
	
}
