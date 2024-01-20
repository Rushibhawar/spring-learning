package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Product1 implements InitializingBean,DisposableBean{
	/*Inorder to get lifecycle methods using interfaces we have IntialixzingBean for overriding init method
	 * in form of afterPropertiesSet method and
	 * we have DisposableBean interface for destroy method*/
	private double price;

	public Product1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product1 [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//init
		System.out.println("inside interface init");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		//destroy
		System.out.println("inside interface destroy");
	}
	
	
}
