package competitiveProgramming;

import java.util.*;

public class CF_1669E {

	static void shinchan() {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0) {
			int n = sc.nextInt();
			Map<Character, Integer> first = new HashMap();
			Map<Character, Integer> second = new HashMap();			
			Map<String, Integer> count = new HashMap();
			long res=0;
			while(n>0) {
				String t = sc.next();
				char[] s = t.toCharArray();
				if(first.containsKey(s[0])) {
					res+=first.get(s[0]);
					first.replace(s[0], first.get(s[0])+1);
				}else {
					first.put(s[0], 1);
				}
				if(second.containsKey(s[1])) {
					res+=second.get(s[1]);
					second.replace(s[1], second.get(s[1])+1);
				}else {
					second.put(s[1], 1);
				}
				if(count.containsKey(t)) {
					res-=count.get(t)*2;
					count.replace(t, count.get(t)+1);
				}else {
					count.put(t, 1);
				}
				n-=1;
			}
			System.out.println(res);
			T-=1;
		}
	}
	
	public static void main(String[] args) {
		shinchan();
	}

}
