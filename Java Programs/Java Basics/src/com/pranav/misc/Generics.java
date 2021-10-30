package com.pranav.misc;

import java.util.*;

class Container<T extends Number> {
	T a;
	
	Container(T t) {
		a=t;
	}
	
	void setA(ArrayList<? extends T> x) {
		a=x.get(0);
	}
	
	void printX(ArrayList<? super T> x) {
		System.out.println(x);
	}
	
	void print() {
		System.out.println(a.getClass().getName());
	}
}

public class Generics {

	public static void main(String[] args) {
		Number a = new Integer(5);
		Container<Integer> c = new Container(5);
		c.print();
	}

}
