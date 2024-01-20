package com.hibernate.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cache.ehcache.internal.EhcacheRegionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.annotationhiber.Student;


public class SecondLevelCache {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		//first
		Session session1 = factory.openSession();
		Student student1 = session1.get(Student.class,102);
		System.out.println(student1);
		
		//second
		Session session2 = factory.openSession();
		Student student2 = session1.get(Student.class,102);
		System.out.println(student2);
		
		
		session1.close();
		session2.close();
		
		factory.close();
	}
}
