package com.pranav.designPatterns.behavioural.visitorPattern;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor{
	public int visit(Book b) {
		System.out.print(b.getPrice());
		return b.getPrice()*95/100;
	}
	
	public int visit(Shoes s) {
		System.out.print(s.getPrice());
		return s.getPrice()*90/100;
	}
	
}
