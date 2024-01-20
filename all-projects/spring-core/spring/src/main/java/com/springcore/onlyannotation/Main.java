package com.springcore.onlyannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class); /*for configuration without xml*/
		
		Student student = context.getBean("getStudent",Student.class); /*here the bean name will the method name in config file*/
		System.out.println(student);
	}

}
