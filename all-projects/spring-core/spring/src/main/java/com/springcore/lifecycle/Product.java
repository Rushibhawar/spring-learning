package com.springcore.lifecycle;

public class Product {
	private double price;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price");
		this.price = price;
	}

	
	public void init() { //here we can have any name to init or destroy method because we will tell spring in xml file that which method is init and destroy
		System.out.println("inside init");
	}
	public void destroy() {
		System.out.println("inside destroy");
	}
	
	@Override
	public String toString() {
		return "Product [price=" + price + "]";
	}
	
}
