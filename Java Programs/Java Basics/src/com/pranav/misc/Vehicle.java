package com.pranav.misc;

public interface Vehicle {
	
	int seat();
	
	//default keyword came into existence after Java 1.7
	
	default void print() {
		System.out.println("Inside Vehicle Interface");
	}
	
	//static method also came into existence from Java 1.8
	
	static void speed() {
		System.out.println("50 kmph inside Vehicle Interface");
	}
}
