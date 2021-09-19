package com.pranav.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		Person p1 = new Person("Pranav");
		System.out.println(p1.getName());
		
		Student s1 = new Student(51, "Prashob");
		System.out.println(s1.getStd());
	
		Person p2 = new Student(19, "Pranav");
		System.out.println(p2.getName());
	
		
	}

}
