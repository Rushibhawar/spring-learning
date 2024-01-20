package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		A aref = (A)context.getBean("aref");
		System.out.println(aref.getX());
		System.out.println(aref.getObj().getY());
		
		B bref = (B)context.getBean("bref");
		System.out.println(bref.getY());
	}

}
