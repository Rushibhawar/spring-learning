package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereotype.cfg.xml");
		
		Student student = context.getBean("student",Student.class);
		System.out.println(student.getAddress());
		System.out.println(student.hashCode());
		
		Student student1 = context.getBean("student",Student.class);
		System.out.println(student1.hashCode());
	}

}
