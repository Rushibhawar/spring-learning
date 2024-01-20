package com.hibernate.hql;

import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.embedable.Student1;

//HQL is independent of Database and used for complex queries
public class HQLExample {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();

		//String query = "from student1 where studentCity = 'mumbai'";
		//we can also set the dynamic value
		//String query = "from student1 where studentCity=:x";
		String query = "from student1 as stu where stu.studentCity =:x and stu.studentName=:n ";

		
		Query q = session.createQuery(query);
		//for single result -(Unique)
		//multiple result - list
		
		//for dynamic values
		q.setParameter("x", "mumbai");
		q.setParameter("n", "kunal");
		
		List<Student1> list=q.list();
		
		for(Student1 student : list) {
			System.out.println("Student Name : " +student.getStudentName() + " Cerificate achived :" + student.getCerificate()  );
		}
		
		System.out.println("_______________________________________");
		
		//delete query and delete requires transaction not for select
		Transaction tx = session.beginTransaction();
		Query q1 = session.createQuery("delete from student1 where studentcity=:x");
		q1.setParameter("x", "delhi");
		
		int result = q1.executeUpdate();
		System.out.println("Deleted rows affected" + result);
//		tx.commit(); we need to commit tx in last 
		
		
		// update query requires transaction
		Query q2 = session.createQuery("update student1 set studentcity=:x where studentname=:y");
		q2.setParameter("x", "delhi");
		q2.setParameter("y", "kunal");
		int result2 = q2.executeUpdate();
		System.out.println("updated city rows affected : " + result2);
		
		
		tx.commit();
		session.close();
		factory.close();
	}
}
