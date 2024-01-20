package com.springcore.stanalonecollection;

import java.util.List;

public class Person {
	private List<String> friends;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(List<String> friends) {
		super();
		this.friends = friends;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + "]";
	}
	
	
}
