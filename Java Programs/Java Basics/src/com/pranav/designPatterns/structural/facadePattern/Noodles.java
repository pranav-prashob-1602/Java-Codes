package com.pranav.designPatterns.structural.facadePattern;

public class Noodles implements Food {
	String preparedItem;
	
	public void prepareFood(String items) {
		preparedItem = "Noodle ingredients are " + items;
	}
	
	public String deliverFood() {
		return preparedItem;
	}
	
}
