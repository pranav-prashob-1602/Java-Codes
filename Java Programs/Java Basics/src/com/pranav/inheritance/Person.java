package com.pranav.inheritance;

public class Person {
	
	String name;
	
	public Person(String name) {
		this.name=name;
		System.out.println("Inside Person constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name=name;
	}
	
}
