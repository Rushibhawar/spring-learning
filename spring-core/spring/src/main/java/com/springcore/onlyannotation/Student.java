package com.springcore.onlyannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("student") now we can so same thong using @Bean annotation in configuration file

public class Student {
	
	@Value("10")
	private int studentId;
	
	@Value("Rushi")
	private String studentName;
	
	
	private Certificate certificate;
	
	
	
	public Student(Certificate certificate) {
		super();
		this.certificate = certificate;
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



	public Certificate getCertificate() {
		return certificate;
	}



	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}



	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", certificate=" + certificate
				+ "]";
	}
	
	
	
}
