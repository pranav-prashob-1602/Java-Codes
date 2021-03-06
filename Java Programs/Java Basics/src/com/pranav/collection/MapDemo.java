package com.pranav.collection;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> mp = new HashMap();
		mp.put(new String("A"), 1);
		mp.put("B", 2);
		mp.put("C", 3);
		mp.put(new String("A"), 4);
		System.out.println(mp);
		System.out.println(mp.get("A"));
		for(Map.Entry<String, Integer> e : mp.entrySet()) {
			System.out.println(e+": " + e.getKey()+"  "+e.getValue());
		}
		
		Map<String, Integer> mp1 = new TreeMap();
		mp1.put(new String("D"), 1);
		mp1.put("B", 2);
		mp1.put("C", 3);
		mp1.put(new String("A"), 4);
		System.out.println(mp1);
		System.out.println(mp1.get("D"));
		for(Map.Entry<String, Integer> e : mp1.entrySet()) {
			System.out.println(e+": " + e.getKey()+"  "+e.getValue());
		}
		
		Map<String, Integer> mp2 = new LinkedHashMap();
		mp2.put(new String("D"), 1);
		mp2.put("B", 2);
		mp2.put("C", 3);
		mp2.put(new String("A"), 4);
		System.out.println(mp2);
		System.out.println(mp2.get("A"));
		for(Map.Entry<String, Integer> e : mp2.entrySet()) {
			System.out.println(e+": " + e.getKey()+"  "+e.getValue());
		}
		
		Map<Student, Integer> mp3 = new HashMap();
		mp3.put(new Student("D", 1), 1);
		mp3.put(new Student("B", 1), 2);
		mp3.put(new Student("C", 1), 3);
		mp3.put(new Student("A", 1), 4);
		System.out.println(mp3);
		System.out.println(mp3.get(new Student("D", 1)));
		for(Map.Entry<Student, Integer> e : mp3.entrySet()) {
			System.out.println(e+": " + e.getKey()+"  "+e.getValue());
		}
		
		Map<Student, Integer> mp4 = new TreeMap();
		mp4.put(new Student("D", 1), 1);
		mp4.put(new Student("B", 5), 2);
		mp4.put(new Student("C", 4), 3);
		mp4.putIfAbsent(new Student("D", 1), 4);
		mp4.putIfAbsent(new Student("E", 1), 4);
		mp4.put(new Student("A", 2), 4);
		System.out.println(mp4);
		System.out.println(mp4.get(new Student("D", 1)));
		for(Map.Entry<Student, Integer> e : mp4.entrySet()) {
			System.out.println(e+": " + e.getKey()+"  "+e.getValue());
		}
		
		System.out.println(mp4.containsValue(5));
		
		System.out.println(mp4.containsKey(new Student("C", 4)));
		
		mp4.putIfAbsent(new Student("E", 1), 4);
		
	}

}
