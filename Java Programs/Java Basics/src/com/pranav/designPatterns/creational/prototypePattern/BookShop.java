package com.pranav.designPatterns.creational.prototypePattern;

import java.util.ArrayList;

public class BookShop implements Cloneable {
	ArrayList<Book> books;
	String shopName;
	
	public void loadData() {
		Book b;
		for(int i=0;i<5;i++) {
			b=new Book();
			b.setId(i);
			b.setName(i+" hello");
			books.add(b);
		}
	}
	
	public ArrayList<Book> getBooks() {
		return books;
	}
	
	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
	public String getShopName() {
		return shopName;
	}
	
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	@Override
	public String toString() {
		return "BookShop [books=" + books + ", shopName=" + shopName + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		BookShop b = new BookShop();
		b.setBooks(new ArrayList<Book>());
		b.setShopName(this.shopName);
		for(Book bb : this.getBooks()) {
			b.getBooks().add(bb);
		}
		return b;
	}
	
}
