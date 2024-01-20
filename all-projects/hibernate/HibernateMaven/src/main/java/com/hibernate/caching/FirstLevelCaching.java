package com.hibernate.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.annotationhiber.Student;

public class FirstLevelCaching {
	public static void main(String[] args) {
		// by default enabled
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = factory.openSession();
		Student student = session.get(Student.class,101);
		System.out.println(student);
		
		System.out.println("_____________");
		
		// when we do something again and again hiberrnate first determines if it is present in cache
		// if no then query will be fired else it will get it from cache without firing query again
		
		Student student1 = session.get(Student.class,101);
		System.out.println(student1);
		
		session.close();
		factory.close();
	}
}
