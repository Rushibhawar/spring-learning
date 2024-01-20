package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/cfg.xml");
		
		//using xml
		Product product1 = (Product)context.getBean("product1");
		System.out.println(product1);
		context.registerShutdownHook();//by default spring does not call the destroy method we override
		// so we have to tell it using this method but here the context must be of type AbstractApplicationContext
		//we have to call once this method inorder to call the destroy method
		
		//using interfaces:
		System.out.println("***************************");
		Product1 product2 = (Product1)context.getBean("product2");
		System.out.println(product2);
		
		
		//using Annotation
		Product3 product3 = (Product3)context.getBean("product3");
		System.out.println(product3);
	}

}
