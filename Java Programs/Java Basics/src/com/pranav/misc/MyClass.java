package com.pranav.misc;

public class MyClass implements InterfaceP{
	private int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public void display() {
		System.out.println(getX());
	}
	
}
