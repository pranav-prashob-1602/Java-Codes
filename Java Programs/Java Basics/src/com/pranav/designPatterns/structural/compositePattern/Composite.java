package com.pranav.designPatterns.structural.compositePattern;

import java.util.*;

interface Component {
	void showPrice();
}

class Leaf implements Component{
	int price;
	String name;
	
	Leaf(String name, int price) {
		super();
		this.name=name;
		this.price=price;
	}
	
	public void showPrice() {
		System.out.println(name+": "+price);
	}
}

public class Composite implements Component {
	List<Component> components = new ArrayList<Component>();
	String name;
	
	Composite(String name) {
		this.name=name;
	}
	
	public void showPrice() {
		System.out.println(name + ":-");
		for(Component c : components) {
			c.showPrice();
		}
	}
	
	public void addComponent(Component c) {
		components.add(c);
	}
}
