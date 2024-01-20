package com.hibernate.annotationhiber;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		// TODO Auto-generated method stub
		//SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		//creating student
		Student student1 = new Student();
		student1.setStudentId(101);
		student1.setStudentName("Divine");
		student1.setStudentCity("Mumbai");
		Student student2 = new Student();
		student2.setStudentId(102);
		student2.setStudentName("Rushi");
		student2.setStudentCity("Pune");
		Student student3 = new Student();
		student3.setStudentId(103);
		student3.setStudentName("Karan");
		student3.setStudentCity("Delhi");
		Student student4 = new Student();
		student4.setStudentId(104);
		student4.setStudentName("Rahul");
		student4.setStudentCity("Kerela");
		Student student5 = new Student();
		student5.setStudentId(105);
		student5.setStudentName("Sam");
		student5.setStudentCity("New York");
		
		System.out.println(student1);
		
		Session session = factory.openSession(); // the factory gives us session we so retrive the current Session
		//factory.getCurrentSession() we donot use this method as we havent created any sesssion prior so it will give error
		// so we create new one
		
		//to begin transaction
		Transaction tx =  session.beginTransaction();
		
		//save
		session.save(student1);
		session.save(student2);
		session.save(student3);
		session.save(student4);
		session.save(student5);
		
		//now commit the current transaction
		tx.commit();
		
		//close session
		session.close();
		
	}

}
