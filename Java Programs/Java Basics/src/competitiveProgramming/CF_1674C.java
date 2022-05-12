package competitiveProgramming;

import java.util.*;

public class CF_1674C {

	static void shinchan() {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0) {
			String s = sc.next();
			String t = sc.next();
			int n  = 0;
			for(int i=0;i<t.length();i++) {
				if(t.charAt(i)=='a') {
					n++;
				}
			}
			if(t.equals("a")) {
				System.out.println(1);
			}else if(n>0) {
				System.out.println(-1);
			}else {
				System.out.println((long)Math.pow(2, s.length()));
			}
			T-=1;
		}
	}
	
	public static void main(String[] args) {
		shinchan();
	}

}
