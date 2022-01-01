package com.pranav.designPatterns.creational.abstractFactoryPattern;

public class HP extends Device{
	int ram;
	String name;
	
	public HP(int ram, String name) {
		this.ram=ram;
		this.name=name;
	}
	
	String getDetails() {
		return name+" "+ram;
	}
}
