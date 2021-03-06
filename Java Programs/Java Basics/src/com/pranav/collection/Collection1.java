package com.pranav.collection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;

public class Collection1 {

	public static void main(String[] args) {
		List c = new ArrayList();
		c.add(5);
		c.add("Pranav");
		c.add('d');
		c.add(1e9);
		c.add(2, "Jigar");
		List d = new ArrayList();
		d.add("igi");
		d.add('a');
		d.add(3);
		Iterator it  = c.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.print(o+" ");
		}
		System.out.println();
//		Consumer a
		c.forEach(i -> System.out.print(i+" A "));
		c.addAll(d);
		System.out.println();
		for(Object e : c) {
			System.out.print(e+" ");
		}
		System.out.println();
		c.set(2, 5);
		c.addAll(2, d);
		for(int i=0;i<c.size();i++) {
			System.out.print(c.get(i)+" ");
		}
		System.out.println();
		Vector v = new Vector();
		for(int i=0;i<21;i++) {
			v.add(i);
			System.out.println(v.capacity());
		}
		List<String> q = Collections.synchronizedList(new ArrayList<String>());
		q.add("A");
		q.add("B");
		q.add("C");
		List<String> l = new CopyOnWriteArrayList<String>();
		l.addAll(q);
		Iterator it2 = l.iterator();
		while(it2.hasNext()) {
			String s = (String)it2.next();
			System.out.println(s);
			l.remove("A");
//			it2.remove();		// it will give UnsupportedOperationException
		}
		System.out.println(l.toString());
		Iterator it1 = q.iterator();
		while(it1.hasNext()) {
			String s = (String)it1.next();
			System.out.println(s);
			q.remove("A");
		}
		System.out.println(q.toString());
//		System.out.println(c.toString());
		
//		Collection d = new Collection();
		
	}

}
