package com.pranav.designPatterns.structural.facadePattern;

public class Pizza implements Food {
	String preparedItem;
	
	public void prepareFood(String items) {
		preparedItem = "Pizza toppings are " + items;
	}
	
	public String deliverFood() {
		return preparedItem;
	}
	
}
