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
		
		Set<Integer> q = new LinkedHashSet();
		q.add(4);
		q.add(2);
		q.add(16);
		q.add(7);
		q.add(19);
		System.out.println(q);
		
		Set<Student> p = new HashSet();
		p.add(new Student("Pranav", 100));
		p.add(new Student("A", 1));
		p.add(new Student("D", 120));
		p.add(new Student("C", 130));
		p.add(new Student("Pranav", 100));
		System.out.println(p);
		
		Set<Student> r = new TreeSet();
		r.add(new Student("Pranav", 100));
		r.add(new Student("A", 1));
		r.add(new Student("D", 120));
		r.add(new Student("C", 130));
		r.add(new Student("Pranav", 100));
		System.out.println(r);
		
		Set<Student>u = new LinkedHashSet();
		u.add(new Student("Pranav", 100));
		u.add(new Student("A", 1));
		u.add(new Student("D", 120));
		u.add(new Student("C", 130));
		u.add(new Student("Pranav", 100));
		System.out.println(u);
		
	}

}
