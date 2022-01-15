package com.pranav.designPatterns.structural.facadePattern;

public class Customer {

	public static void main(String[] args) {
		/*Ingredient ind =new Ingredient();
		
		Food pizza = new Pizza();
		pizza.prepareFood(ind.getPizzaItems());
		
		Food noodles = new Noodles();
		noodles.prepareFood(ind.getNoodlesItems());
		
		System.out.println(pizza.deliverFood());
		System.out.println(noodles.deliverFood());*/
		
		
		System.out.println(Waiter.deliverFood(FoodType.PIZZA));
		System.out.println(Waiter.deliverFood(FoodType.NOODLES));
	}

}
