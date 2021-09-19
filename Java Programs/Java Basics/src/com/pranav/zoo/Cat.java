package com.pranav.zoo;

public class Cat extends Animal1 implements Pet {
	
	void sleep() {
		System.out.println("Cat always sleeps");
	}
	
	public void eat() {
		System.out.println("Cat eats");
	}
	
	public void play() {
		System.out.println("Cat plays");
	}
	
}	
