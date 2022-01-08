package com.pranav.misc;

import java.lang.reflect.Constructor;
import java.util.ArrayDeque;

public class ReflectionClass {

	public static void main(String[] args) {
		ArrayDeque<Integer> adq = new ArrayDeque();
		adq.offer(5);
		adq.offerFirst(3);
		adq.offerLast(6);
		adq.offer(7);
		System.out.println(adq);
		
		
		Class c = adq.getClass();
		System.out.println(c.getName());
		System.out.println(adq.getClass());
		System.out.println(c.isInterface());
		Constructor[]  obj = ArrayDeque.class.getDeclaredConstructors();
		
		ArrayDeque aq = null;
		
		for(Constructor a : obj) {
			System.out.println(a);
			try {
				aq = (ArrayDeque)a.newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
