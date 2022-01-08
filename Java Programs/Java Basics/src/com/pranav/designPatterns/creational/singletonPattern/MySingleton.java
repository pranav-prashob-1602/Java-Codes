package com.pranav.designPatterns.creational.singletonPattern;

public enum MySingleton {
	INSTANCE;
	
	private MySingleton() {
		System.out.println("we lost to reflection");
	}
}
