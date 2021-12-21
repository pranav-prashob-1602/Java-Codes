package com.pranav.designPatterns.creational.abstractFactoryPattern;

public class Dell extends Device {
	int ram;
	String name;
	
	public Dell(int ram, String name) {
		this.ram=ram;
		this.name=name;
	}
	
	String getDetails() {
		return name+" "+ram;
	}
	
}
