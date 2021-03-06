package com.pranav.misc;

import java.util.*;
import java.util.function.*;

class Laptop implements Comparable<Laptop> {
	String brand;
	Integer price;
	Integer ram;
	
	Laptop(String brand, Integer price, Integer ram) {
		this.brand = brand;
		this.price = price;
		this.ram = ram;
	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getRam() {
		return ram;
	}
	public void setRam(Integer ram) {
		this.ram = ram;
	}
	
	public int compareTo(Laptop l) {
		if(this.ram>l.ram) {
			return 1;
		}else if(this.ram<l.ram) {
			return -1;
		}
		return 0;
	}
	
	public String toString() {
		return brand+ " " + price + " " + ram; 
	}
	
}

public class ComparatorAbleRunner {

	public static void main(String[] args) {
		List<Laptop> v = new ArrayList();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			String s = sc.next();
			int a = sc.nextInt();
			int b = sc.nextInt();
			v.add(new Laptop(s, a, b));
		}
		System.out.println(v);
		Collections.sort(v);
		System.out.println(v);
		Comparator<Laptop> c  = new Comparator<Laptop>() {
			public int compare(Laptop a, Laptop b) {
				if(a.price>b.price) {
					return 1;
				}else if(a.price<b.price) {
					return -1;
				}
				return 0;
			}
		};
		Collections.sort(v, c);
		System.out.println(v);
	}

}

/*
Dell 10015 4
HP 10052 8
Lenovo 10020 2
*/