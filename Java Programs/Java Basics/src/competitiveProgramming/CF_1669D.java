package competitiveProgramming;

import java.util.*;

public class CF_1669D {

	static void shinchan() {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0) {
			int n = sc.nextInt();
			String t = sc.next();
			char[] s = t.toCharArray();
			boolean res=true;
			if(n==1) {
				if(s[0]=='W') {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
				T-=1;
				continue;
			}
			int[] cnt = new int[2];
			for(int i=0;i<n;i++) {
				char ch = s[i];
				if(ch=='W') {
					if(cnt[0]==cnt[1] && cnt[0]==0) {
						continue;
					}else if(cnt[0]==0 || cnt[1]==0) {
						res=false;
						break;
					}
					cnt[0]=0;
					cnt[1]=0;
				}else {
					if(ch=='B') {
						cnt[0]++;
					}else {
						cnt[1]++;
					}
				}
			}
			if((cnt[0]!=cnt[1]) && (cnt[0]==0 || cnt[1]==0)) {
				res=false;
			}
			if(res) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			T-=1;
		}
	}
	
	public static void main(String[] args) {
		shinchan();
	}

}
