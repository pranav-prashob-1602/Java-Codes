package com.pranav.designPatterns.behavioural.commandPattern;

public class BuyStock implements Order{
	Stock s;
	
	public BuyStock(Stock st) {
		s = st;
	}
	
	public void execute(int q) {
		int k = s.buy(q);
		System.out.println(k + " "+s.getName()+" stocks bought");
	}
}
