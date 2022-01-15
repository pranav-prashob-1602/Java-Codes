package com.pranav.designPatterns.structural.facadePattern;

public class Waiter {
	public static String deliverFood(FoodType food) {
		Ingredient ind =new Ingredient();
		
		switch(food) {
			case PIZZA:
				Food pizza = new Pizza();
				pizza.prepareFood(ind.getPizzaItems());
				return pizza.deliverFood();
			case NOODLES:
				Food noodles = new Noodles();
				noodles.prepareFood(ind.getNoodlesItems());
				return noodles.deliverFood();
			default:
				return "";	
		}
	}
}
