package com.hibernate.embedable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Student1 student = new Student1();
		student.setStudentId(104);
		student.setStudentName("Om");
		student.setStudentCity("Pune");
		Certificate certificate = new Certificate("Python","10hrs");
		student.setCerificate(certificate );
		
		
		Student1 student1 = new Student1();
		student.setStudentId(105);
		student.setStudentName("Omkar");
		student.setStudentCity("Mumbai");
		Certificate certificate1 = new Certificate("Java","11hrs");
		student.setCerificate(certificate1 );
		
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		//save objects
		session.save(student);
		session.save(student1);
		
		tx.commit();
		session.close();
		factory.close();
	}

}
