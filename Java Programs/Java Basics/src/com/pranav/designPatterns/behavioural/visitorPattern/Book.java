package com.pranav.designPatterns.behavioural.visitorPattern;

public class Book implements  Item{
	private int price, isbn;
	
	public Book(int price, int isbn) {
		this.price = price;
		this.isbn = isbn;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public int accept(ShoppingCartVisitor v) {
		int p = v.visit(this);
		System.out.println(" " + p);
		return p;
	}
}
