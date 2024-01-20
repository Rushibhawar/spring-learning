package com.springcore.constructor;

public class Person {
	private int personId;
	private String personName;
	private Certificate certificate;
	public Person(int personId, String personName) {
		this.personId = personId;
		this.personName = personName;
	}
	
	public Person(int personId, String personName, Certificate certificate) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.certificate = certificate;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", certificate=" + certificate + "]";
	}

	
	
	
}
