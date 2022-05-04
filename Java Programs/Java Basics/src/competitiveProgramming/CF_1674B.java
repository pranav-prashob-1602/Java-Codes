package competitiveProgramming;

import java.util.*;

public class CF_1674B {

	static void shinchan() {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0) {
			String s = sc.next();
			int res = (s.charAt(0)-'a')*26+(s.charAt(1)-'a');
			if(s.charAt(0)<=s.charAt(1)) {
				res-=Math.max(0, (s.charAt(0)-'a'));
			}else {
				res-=Math.max(0, (s.charAt(0)-'a')-1);
			}
			System.out.println(res);
			T--;
		}
	}
	
	public static void main(String[] args) {
		shinchan();
	}

}
