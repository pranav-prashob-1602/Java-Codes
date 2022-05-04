package competitiveProgramming;

import java.util.*;

public class CF_1674A {

	static void shinchan() {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(y%x==0) {
				System.out.println(1+" "+(y/x));
			}else {
				System.out.println(0+" "+0);
			}
			T--;
		}
	}
	
	public static void main(String[] args) {
		shinchan();
	}

}
