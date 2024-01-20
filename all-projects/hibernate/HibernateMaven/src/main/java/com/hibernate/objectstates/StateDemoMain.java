package com.hibernate.objectstates;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StateDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Transient
		 * Persistent
		 * Detached
		 * Removed*/
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		//Student object
		StudentData student = new StudentData();
		student.setStudentId(101);
		student.setStudentName("Rushi");
		student.setStudentCity("Pune");
		
		StudentCertificate certificate = new StudentCertificate();
		certificate.setCourse("Java Certification");
		certificate.setDuration("11hrs");
		student.setCertificate(certificate);
		//student is in Transient State not in session obj nor database
		
		Session session = factory.openSession();
		Transaction tx =  session.beginTransaction();
		
		session.save(student);
		//in Persistent State -session object & Database
		student.setStudentName("Om");// we can change the object if it is in persisitent state
		
		
		tx.commit();
		session.close();//session.clear();
		student.setStudentName("John");//now this will not be saved in databse as the object is associated with DB but the session is closed so 
		//it will not be saved because it is in Detached State
		//Detached state associate with only -DB
		factory.close();
		
		//removed state session.delete()
		
	}

}
