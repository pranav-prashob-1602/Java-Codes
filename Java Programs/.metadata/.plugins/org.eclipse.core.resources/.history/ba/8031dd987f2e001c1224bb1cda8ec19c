package com.pranav.exception;

public class NestedException {

	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			System.out.println(a[7]);
			try {
				int x=5,y=0;
				System.out.println(x/y);
			}catch(ArithmeticException e) {
				e.printStackTrace();
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

}
