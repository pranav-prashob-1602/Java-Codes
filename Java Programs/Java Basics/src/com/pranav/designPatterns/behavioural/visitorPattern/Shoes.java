package com.pranav.designPatterns.behavioural.visitorPattern;

public class Shoes implements Item{
	private int price, size;
	
	public Shoes(int price, int size) {
		this.price = price;
		this.size = size;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int accept(ShoppingCartVisitor v) {
		int p = v.visit(this);
		System.out.println(" " + p);
		return p;
	}
}
