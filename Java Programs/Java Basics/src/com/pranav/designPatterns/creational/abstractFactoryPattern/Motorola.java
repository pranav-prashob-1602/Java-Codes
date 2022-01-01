package com.pranav.designPatterns.creational.abstractFactoryPattern;

public class Motorola extends Device {
	int ram;
	String name;
	
	public Motorola(int ram, String name) {
		this.ram=ram;
		this.name=name;
	}
	
	String getDetails() {
		return name+" "+ram;
	}
}
