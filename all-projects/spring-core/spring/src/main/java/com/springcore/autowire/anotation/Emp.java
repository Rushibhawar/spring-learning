package com.springcore.autowire.anotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired // we need to enable annotations in cfg.xml
	@Qualifier("address1") //specifies which bean to refer
	private Address address;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//@Autowired we can use this on constructor
	public Emp(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	//@Autowired we can use this on getter method
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("inside constructor");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
}
