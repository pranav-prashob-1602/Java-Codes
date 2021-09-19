package com.pranav.inheritance;

public class Student extends Person {
	
	int std;
	
	public Student(int std, String name) {
		super(name);
		this.std=std;
		System.out.println("Inside Student constructor");
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std=std;
	}
	
}
