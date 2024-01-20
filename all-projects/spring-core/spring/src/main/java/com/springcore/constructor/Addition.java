package com.springcore.constructor;

public class Addition {
	private int a;
	private int b;
	//constructor ambiguity is when the ioc container takes values by default String
	//then it check if the class has any constructor taking parameter of type string
	// if its there then it will that else it will call the constructor which takes 
	//with the no. of arguments mentioned of any other typer which is at top
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("contructor : int,int");
	}
	
	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("contructor : double,double");
	}
	public Addition(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("contructor : String,String");
	}
	
	public void doSum() {
		System.out.println("addotion : "+(this.a + this.b));
		System.out.println("a : "+this.a);
		System.out.println("b : "+this.b);
	}
}
