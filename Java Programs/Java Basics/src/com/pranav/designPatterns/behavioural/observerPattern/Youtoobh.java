package com.pranav.designPatterns.behavioural.observerPattern;

import java.util.*;

public class Youtoobh {

	public static void main(String[] args) {
		Channel c1  = new Channel("DorzoxYT : The Dragon Hunter");
		Channel c2 = new Channel("MonzoxYT : The Monster Hunter");
		List<Subscriber> l = new ArrayList<Subscriber>();
		for(int i=0;i<5;i++) {
			if(i%2==0) {
				l.add(new Subscriber("A "+i, c1));
			}else {
				l.add(new Subscriber("B "+i, c2));
			}
		}
		c1.upload("1st Dragon murdered");
		c2.upload("1st Monster killed");
		l.get(2).unsubscribeChannel();
		System.out.println(l.get(2).name + " has unsubscribed");
		c1.upload("2nd Dragon killed");
	}

}
