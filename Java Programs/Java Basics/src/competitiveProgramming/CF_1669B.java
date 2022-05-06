package competitiveProgramming;

import java.util.*;

public class CF_1669B{

	static void shinchan() {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0) {
			int n = sc.nextInt();
			List<Integer> v = new ArrayList();
			Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
			for(int i=0;i<n;i++) {
				int x = sc.nextInt();
				if(mp.containsKey(x)) {
					mp.replace(x, mp.get(x)+1);
				}else {
					mp.put(x,  1);
				}
			}
			int res = -1;
			for(Map.Entry<Integer, Integer> e : mp.entrySet()) {
				if(e.getValue()>=3) {
					res = e.getKey();
				}
			}
			System.out.println(res);
			T-=1;
		}
	}
	
	public static void main(String[] args) {
		shinchan();
	}

}
