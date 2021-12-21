package com.pranav.designPatterns.creational.factoryPattern;

public class FactoryRunner {

	public static void main(String[] args) {
		
		OSFactory ref = new OSFactory(); 
		
		OS linus = ref.getInstance("Linux");
		OS bill = ref.getInstance("Windows");
		OS steve  = ref.getInstance("IOS");
		
		linus.getSpecification();
		bill.getSpecification();
		steve.getSpecification();
		
	}

}
