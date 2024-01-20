package com.springcore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstrucMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructor/construcconfig.xml");
		Person person = (Person)context.getBean("construc1");
		System.out.println(person);
		System.out.println();
		
		Addition add = (Addition)context.getBean("addition");
		add.doSum();
	}

}
