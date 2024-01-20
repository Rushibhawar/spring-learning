package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Product3 {
	private String subject;

	public Product3() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Product3 [subject=" + subject + "]";
	}
	
	@PostConstruct //inorder to enable annotation we add<context:annotation-config/> in xml file
	public void init() {
		System.out.println("inside anno init");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("inside anno destroy");
	}
}
