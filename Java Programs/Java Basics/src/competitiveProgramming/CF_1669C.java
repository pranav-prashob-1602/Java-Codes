package competitiveProgramming;

import java.util.*;

public class CF_1669C {

	static void shinchan() {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0) {
			int n = sc.nextInt();
			List v = new ArrayList<Integer>();
			for(int i=0;i<n;i++) {
				int x = sc.nextInt();
				v.add(x);
			}
			Set even = new HashSet<Integer>();
			Set odd = new HashSet<Integer>();			
			for(int i=0;i<n;i++) {
				int x = (int) v.get(i);
				if(i%2==0) {
					even.add(x%2);
				}else {
					odd.add(x%2);
				}
			}
			if(even.size()==1 && odd.size()==1) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			T--;
		}
	}
	
	public static void main(String[] args) {
		shinchan();
	}

}
