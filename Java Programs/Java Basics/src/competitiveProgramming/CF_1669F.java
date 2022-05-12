package competitiveProgramming;

import java.util.*;

public class CF_1669F {

	static void shinchan() {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0) {
			int n = sc.nextInt();
			long res=0;
			ArrayList<Integer> q = new ArrayList();
			for(int i=0;i<n;i++) {
				q.add(sc.nextInt());
			}
			HashMap<Integer, Integer> mp = new HashMap();
			Integer sum=0,k=0;
			for(int i=n-1;i>=0;i--) {
				sum+=q.get(i);
				k+=1;
				mp.put(sum, k);
			}
			sum=0;
			for(int i=0;i<n;i++) {
				sum+=q.get(i);
				if(mp.containsKey(sum)) {
					int r = mp.get(sum);
					if(!(i>n-r-1)) {
						res=i+1+r;
					}
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
