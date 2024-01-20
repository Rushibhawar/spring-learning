package com.hibernate.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Question question = new Question();
		question.setQuestionId(103);
		question.setQuestion("What is java");
		
		Answer answer = new Answer();
		answer.setAnswerId(13);
		answer.setAnswer("Java is programming language");
		question.setAnswer(answer);
		
		Question question1 = new Question();
		question1.setQuestionId(102);
		question1.setQuestion("What is pyhton");
		
		Answer answer1 = new Answer();
		answer1.setAnswerId(12);
		answer1.setAnswer("python is programming language");
		question1.setAnswer(answer1);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(answer);
		session.save(question);
		session.save(answer1);
		session.save(question1);
		tx.commit();
		session.close();
		factory.close();
	}

}
