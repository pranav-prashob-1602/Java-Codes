package com.pranav.designPatterns.creational.abstractFactoryPattern;

public class Nokia extends Device{
	int ram;
	String name;
	
	public Nokia(int ram, String name) {
		this.ram=ram;
		this.name=name;
	}
	
	String getDetails() {
		return name+" "+ram;
	}
}
