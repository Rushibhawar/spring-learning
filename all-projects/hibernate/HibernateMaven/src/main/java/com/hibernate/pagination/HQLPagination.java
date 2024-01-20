package com.hibernate.pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.annotationhiber.Student;

public class HQLPagination {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = factory.openSession();
		
		Query query =  session.createQuery("from Student");
		
		//implementating pagination
		
		query.setFirstResult(4);// it means from where to start
		query.setMaxResults(4); // it is the limit 
		List<Student> list = query.list();
		
		for(Student s : list) {
			System.out.println(s);
		}
		
		session.close();
	}
}
