package com.pranav.designPatterns.behavioural.visitorPattern;

import java.util.*;

public class ShoppingCart {
	
	public static int calculatePrice(List<Item> l) {
		int res=0;
		ShoppingCartVisitor s = new ShoppingCartVisitorImpl();
		for(Item i : l) {
			res+=i.accept(s);
		}
		return res;
	}
	
	public static void main(String[] args) {
		List<Item> l = new ArrayList<Item>();
		
		for(int i=0;i<5;i++) {
			if(i%2==0) {
				l.add(new Shoes(100*(i+1), 6+i));
			}else {
				l.add(new Book(90*(i+1), 100+i));
			}
		}
		
		System.out.println("Total Amount: " + calculatePrice(l));
		
	}

}
