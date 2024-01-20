package com.hibernate.cascading;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.mapping.onetomanytoone.Answer1;
import com.hibernate.mapping.onetomanytoone.Question;

public class CascadingExample {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = factory.openSession();
		
		Question q1 = new Question();
		q1.setQuestionId(51);
		q1.setQuestion("what is Hibernate ? ");
		
		Answer1 a1 = new Answer1(101, "It is ORM");
		Answer1 a2 = new Answer1(102, "It is Java Framework");
		Answer1 a3 = new Answer1(103, "It is makes databse fetching easy");
		
		List<Answer1> list = new ArrayList<Answer1>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		q1.setAnswer(list);
		
		Transaction tx = session.beginTransaction();
		
		session.save(q1);
		//we have to save answers manually so we have to use cascade
		// using cascade if we don't have to write again and again
//		session.save(a1);
//		session.save(a2);
//		session.save(a3);
		
		tx.commit();
		
		session.close();
		factory.close();
	}
}
