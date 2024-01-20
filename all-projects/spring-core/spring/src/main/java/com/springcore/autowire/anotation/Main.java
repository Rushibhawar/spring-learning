package com.springcore.autowire.anotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/anotation/cfg.xml");
		Emp emp = context.getBean("emp",Emp.class);
		
		System.out.println(emp);
	}

}
