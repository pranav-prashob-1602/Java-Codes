package com.pranav.threads;

public class TableThreadRunner {

	public static void main(String[] args) {
		Table t = new Table();
		Thread1 t1 = new Thread1(t);
		Thread2 t2 = new Thread2(t);
		t2.start();
		t1.start();
	}

}
