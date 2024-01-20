package com.hibernate.fetch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.annotationhiber.Student;
import com.hibernate.img.Address;

public class FetchDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = factory.openSession();
		//to fetch data from database if we know using primary key value
		//we use get(Entity, id) or load(Entity , id) method
		//get-student:106
		//get() is used when u r not sure and it returns null if object not found in DB
		Student student = (Student)session.get(Student.class,101 );
		System.out.println(student);
		Student student1 = (Student)session.get(Student.class,101 );
		System.out.println(student1);
		//now here hibernate will fire select query only once as for first it is stored in the cache memory of session
		
		
		//load() is used when we are sure object exists and throws ObjectNotFound exception if not found in DB
		Address address = (Address)session.load(Address.class, 2);
		System.out.println(address);
		
		session.close();
		factory.close();
	}
}
