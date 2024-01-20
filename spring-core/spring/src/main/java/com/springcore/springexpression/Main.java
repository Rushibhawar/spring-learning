package com.springcore.springexpression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springexpression/expression.cfg.xml");
		Demo demo = context.getBean("demo",Demo.class);
		System.out.println(demo);
	}

}
