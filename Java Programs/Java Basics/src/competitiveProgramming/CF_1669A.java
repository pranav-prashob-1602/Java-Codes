package competitiveProgramming;

import java.util.*;

public class CF_1669A{

	static void shinchan() {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0) {
			int n = sc.nextInt();
			if(n>=1900) {
				System.out.println("Division 1");
			}else if(n>=1600) {
				System.out.println("Division 2");
			}else if(n>=1400) {
				System.out.println("Division 3");
			}else {
				System.out.println("Division 4");
			}
			T-=1;
		}
	}
	
	public static void main(String[] args) {
		shinchan();
	}

}
