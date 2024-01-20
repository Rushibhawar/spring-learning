package com.hibernate.criteriaAPI;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.hibernate.embedable.Student1;

//Criteria API is used when we don't have to write sql query by or hql by ourself just using functions

public class CriteriaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		
		Criteria criteria = session.createCriteria(Student1.class);
	
		//we can add conditions with
		criteria.add(Restrictions.eq("cerificate.course", "java"));
		criteria.add(Restrictions.gt("id", 11));
		
		
		List<Student1> list = criteria.list();
		
		for(Student1 student : list) {
			System.out.println(student);
		}
	}

}
