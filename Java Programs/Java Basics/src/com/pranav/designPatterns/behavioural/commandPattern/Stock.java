package com.pranav.designPatterns.behavioural.commandPattern;

public class Stock {
	String name;
	int quantity;
	
	public Stock(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	
	int buy(int q) {
		if(q>quantity) {
			return 0;
		}
		quantity-=q;
		return q;
	}
	
	void sell(int q) {
		quantity+=q;
	}
	
}
