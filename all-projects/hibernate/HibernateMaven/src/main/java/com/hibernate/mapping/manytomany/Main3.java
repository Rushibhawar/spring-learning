package com.hibernate.mapping.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		//employe1
		Emp emp1 = new Emp();
		emp1.setEmpId(22);
		emp1.setEmpName("Om");
		
		//employee2
		Emp emp2 = new Emp();
		emp2.setEmpId(33);
		emp2.setEmpName("Omkar");
		
		//project1
		Project project1 = new Project();
		project1.setProjectId(101);
		project1.setProjectName("Python project");
		
		//project2
		Project project2 = new Project();
		project2.setProjectId(102);
		project2.setProjectName("Java project");
		
		
		//create list of employees and add employees we created
		List<Emp> empList = new ArrayList<Emp>();
		empList.add(emp1);
		empList.add(emp2);
		
		//create list of projects and add project we created
		List<Project> projectList = new ArrayList<Project>();
		projectList.add(project1);
		projectList.add(project2);
		
		emp1.setProject(projectList);
		project2.setEmp(empList);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		//save
		session.save(emp1);
		session.save(emp2);
		session.save(project1);
		session.save(project2);
		
		tx.commit();
		session.close();
		factory.close();
	}

}
