package com.hibernate.joins;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.mapping.onetomanytoone.Answer1;
import com.hibernate.mapping.onetomanytoone.Question;

public class JoinMain {
	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
//		Question question = new Question();
//		question.setQuestionId(0);
//		question.setQuestion("What is python?");
//		
//		Answer1 answer = new Answer1();
//		answer.setAnswerId(0);
//		answer.setAnswer("Python is programming language");
//		answer.setQuestion(question);
//		
//		Answer1 answer1 = new Answer1();
//		answer1.setAnswerId(1);
//		answer1.setAnswer("Python is Object Oriented programming language");
//		answer1.setQuestion(question);
//		
//		List<Answer1> listOfAnswers = new ArrayList<Answer1>();
//		listOfAnswers.add(answer);
//		listOfAnswers.add(answer1);
//		question.setAnswer(listOfAnswers);
//		
//		
//		Question question1 = new Question();
//		question1.setQuestionId(1);
//		question1.setQuestion("What is java?");
//		
//		Answer1 answer2 = new Answer1(3, "Java is robust object oriented programming language");
//		Answer1 answer3 = new Answer1(4, "Java is multithreaded programming language");
//		answer2.setQuestion(question1);
//		answer3.setQuestion(question1);
//		
//		List<Answer1> listOfAnswers1 = new ArrayList<Answer1>();
//		listOfAnswers1.add(answer2);
//		listOfAnswers1.add(answer3);
//		question1.setAnswer(listOfAnswers1);
//		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
//		session.save(answer);
//		session.save(answer1);
//		session.save(answer2);
//		session.save(answer3);
//		session.save(question);
//		session.save(question1);

		Query q = session.createQuery("SELECT q.question,q.questionId,a.answer FROM Question as q INNER JOIN q.answer as a");
		//we use list of Object array because it returns array whose indexes are the columns of table
		List<Object[]> list = q.getResultList();
		System.out.println(list);
		for(Object[] array : list) {
			System.out.println(Arrays.toString(array));
		}
		
		tx.commit();
		session.close();
		factory.close();
	}	
}
