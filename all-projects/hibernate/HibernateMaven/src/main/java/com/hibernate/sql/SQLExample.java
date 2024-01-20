package com.hibernate.sql;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.hibernate.annotationhiber.Student;

public class SQLExample {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = factory.openSession();
		
		//SQL Query
		String query = "SELECT * FROM student";
		
		NativeQuery nq = session.createSQLQuery(query);
		
		List<Object[]> list = nq.list();
		
		for(Object[] student : list) {
			System.out.println(Arrays.toString(student));
		}
		
		session.close();
		factory.close();
	}
}
