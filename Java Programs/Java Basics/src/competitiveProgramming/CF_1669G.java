package competitiveProgramming;

import java.util.*;

public class CF_1669G {

	static void shinchan() {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			char[][] v = new char[n][m];
			for(int i=0;i<n;i++) {
				String t = sc.next();
				char[] s = t.toCharArray();
				for(int j=0;j<m;j++) {
					v[i][j] = s[j];
				}
			}
			for(int j=0;j<m;j++) {
				int k=0,p=0;
				for(int i=0;i<n;i++) {
					if(v[i][j]=='*') {
						k++;
					}
					if(v[i][j]=='o') {
						for(int q=i-1;q>=p;q--) {
							if(k>0) {
								v[q][j]='*';
								k--;
							}else {
								v[q][j]='.';
							}
						}
						p=i+1;
						k=0;
					}
				}
				if(k>0) {
					for(int q=n-1;q>=p;q--) {
						if(k>0) {
							v[q][j]='*';
							k--;
						}else {
							v[q][j]='.';
						}
					}
					k=0;
				}
			}
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					System.out.print(v[i][j]);
				}
				System.out.println();
			}
			T-=1;
		}
	}
	
	public static void main(String[] args) {
		shinchan();
	}

}
