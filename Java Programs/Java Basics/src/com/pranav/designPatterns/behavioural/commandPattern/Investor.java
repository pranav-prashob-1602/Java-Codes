package com.pranav.designPatterns.behavioural.commandPattern;

public class Investor {

	public static void main(String[] args) {
		Stock st  = new Stock("paytm", 100);
		BuyStock b = new BuyStock(st);
		SellStock s = new SellStock(st);
		
		Broker h = new Broker();
		
		h.takeOrder(b, 10);
		h.takeOrder(b, 100);
		h.takeOrder(s, 90);
		h.takeOrder(b, 100);
		
		h.placeOrders();
		
	}

}
