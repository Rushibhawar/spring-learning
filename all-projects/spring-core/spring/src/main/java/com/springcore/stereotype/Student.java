package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //@Component("student1") which we can give name to bean by the component name will be class name in camelCase
@Scope("prototype") //scope can be singleton and prototype which is opposite of singleton
public class Student {
	
	@Value("Rushikesh B")
	private String name;
	
	@Value("Pune")
	private String city;
	
	@Value("#{list1}")
	private List<String> address;
	
	public Student(String name, String city, List<String> address) {
		super();
		this.name = name;
		this.city = city;
		this.address = address;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}
	
	
}
