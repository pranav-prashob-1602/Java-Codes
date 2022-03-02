package com.pranav.designPatterns.behavioural.commandPattern;

import java.util.*;

public class Broker {
	private List<Order> orderList = new ArrayList<Order>();
	private List<Integer> quantityList = new ArrayList<Integer>();
	
	public void takeOrder(Order o, int q) {
		orderList.add(o);
		quantityList.add(q);
	}
	
	public void placeOrders() {
		for(int i=0;i<orderList.size();i++) {
			orderList.get(i).execute(quantityList.get(i));
		}
		orderList.clear();
		quantityList.clear();
	}
	
}
