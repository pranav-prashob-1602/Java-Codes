package com.pranav.collection;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet();
		s.add(4);
		s.add(2);
		s.add(16);
		s.add(7);
		s.add(19);
		System.out.println(s);
		
		Set<Integer> t = new TreeSet();
		t.add(4);
		t.add(2);
		t.add(16);
		t.add(7);
		t.add(19);
		System.out.println(t);
		
	}

}
