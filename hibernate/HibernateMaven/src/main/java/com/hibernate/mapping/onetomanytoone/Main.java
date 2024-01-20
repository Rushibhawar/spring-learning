package com.hibernate.mapping.onetomanytoone;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Question question = new Question();
		question.setQuestionId(110);
		question.setQuestion("What is python");
		
		Answer1 answer = new Answer1();
		answer.setAnswerId(20);
		answer.setAnswer("python is programming language");
		answer.setQuestion(question);
		
		Answer1 answer1 = new Answer1();
		answer1.setAnswerId(22);
		answer1.setAnswer("python is OOP programming language");
		answer1.setQuestion(question);
		
		//add answers into List
		List<Answer1> answerList = new ArrayList<Answer1>();
		//add first answer to list
		answerList.add(answer);
		//add second ans to list
		answerList.add(answer1);
		
		//now set many answers into one question
		question.setAnswer(answerList);
		 
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(answer);
		session.save(answer1);
		session.save(question);
		
		tx.commit();
		session.close();
		factory.close();
	}

}
