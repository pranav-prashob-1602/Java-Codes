package com.pranav.collection;

import java.util.Objects;

public class Student implements Comparable{
	String name;
	int roll;
	
	Student(String name, int roll) {
		this.name=name;
		this.roll=roll;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public String toString() {
		return name+" "+roll;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this==obj) {
			return true;
		}
		if(obj==null || this.getClass()!=obj.getClass()) {
			return false;
		}
		Student s = (Student)obj;
		return (s.name==this.name && s.roll == this.roll);
//		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
//		int val=0, x=7;
//		for(int i=0;i<name.length();i++) {
//			val+=((int)name.charAt(i)*x)%13;
//			x*=7;
//		}
//		val+=roll*x;
//		val%=13;
//		return val;
		return Objects.hash(name+" "+roll);
//		return super.hashCode();
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student s = (Student)o;
		int x = this.name.compareTo(s.name);
		if(x==0) {
			if(this.roll<s.roll) {
				return 1;
			}else if(this.roll==s.roll){
				return 0;
			}else {
				return -1;
			}
		}else {
			return x;
		}
	}
	
}
