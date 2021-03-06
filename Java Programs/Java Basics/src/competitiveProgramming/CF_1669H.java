package competitiveProgramming;

import java.util.*;

public class CF_1669H {

	static void shinchan() {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] v = new int[n];
			for(int i=0;i<n;i++) {
				v[i]=sc.nextInt();
			}
			int[] cnt = new int[31];
			for(int i=0;i<n;i++) {
				for(int j=0;j<=30;j++) {
					if((v[i] & (1<<j))==0) {
						cnt[j]++;
					}
				}
			}
			long res=0;
			for(int i=30;i>=0;i--) {
				if(cnt[i]<=m || cnt[i]==0) {
					m-=cnt[i];
					res+=(1<<i);
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
