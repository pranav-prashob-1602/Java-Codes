package com.pranav.designPatterns.creational.prototypePattern;

import java.util.ArrayList;

public class BookShopRunner {

	public static void main(String[] args) {
		BookShop b1 = new BookShop();
		b1.setShopName("ABC");
		b1.setBooks(new ArrayList<Book>());
		b1.loadData();
		
		System.out.println(b1);
		BookShop b2=null;
		try {
			b2=(BookShop)b1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println(b2);
		b2.getBooks().remove(1);
		System.out.println(b1);
		System.out.println(b2);
	}

}
