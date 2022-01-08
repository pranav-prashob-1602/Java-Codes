package com.pranav.collection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque<Integer> adq = new ArrayDeque();
		adq.offer(5);
		adq.offerFirst(3);
		adq.offerLast(6);
		adq.offer(7);
		System.out.println(adq);
		
	}

}
