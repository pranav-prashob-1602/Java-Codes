package com.pranav.threads;

public class D extends C implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("i = "+i+" Thread D");
		}
	}
}
