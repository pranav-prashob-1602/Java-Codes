package com.pranav.designPatterns.behavioural.commandPattern;

public class SellStock implements Order{
	Stock s;
	
	public SellStock(Stock st) {
		s = st;
	}
	
	public void execute(int q) {
		s.sell(q);
		System.out.println(s.getName()+" stocks sold");
	}
}