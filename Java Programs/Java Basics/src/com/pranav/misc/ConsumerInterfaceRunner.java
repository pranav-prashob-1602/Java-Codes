package com.pranav.misc;

import java.util.*;
import java.util.function.Consumer;

class ConsumerImpl implements Consumer<Integer> {
	public void accept(Integer t) {
		System.out.println(t);
	}
}

public class ConsumerInterfaceRunner {

	public static void main(String[] args) {
		List<Integer> v = Arrays.asList(5, 3, 2, 7, 9);
		for(int i=0;i<v.size();i++) {
			System.out.print(v.get(i)+" ");
		}
		System.out.println();
		for(int i : v) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//v.forEach(i -> System.out.println(i));   	//Consumer
		
		//Consumer<Integer> c = new ConsumerImpl();
		//v.forEach(c);
		
		Consumer<Integer> c1 = new Consumer<Integer>() {
														public void accept(Integer i) {
															System.out.print(i+" ");
														}
												};					
		v.forEach(c1);
		System.out.println();
		
		Consumer<Integer> c2 = i -> System.out.print(i+" ");
		v.forEach(c2);
		System.out.println();
		
		v.forEach(i -> System.out.print(i+" "));
	}

}
