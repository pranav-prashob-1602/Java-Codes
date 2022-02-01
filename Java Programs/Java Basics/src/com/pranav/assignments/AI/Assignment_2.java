package com.pranav.assignments.AI;

import java.util.*;

public class Assignment_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = sc.nextInt();
		List<Integer> v = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			v.add(x);
		}
		boolean[][] dp = new boolean[n+1][sum+1];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=sum;j++) {
				if(i==0 || j==0) {
					if(i==0) {
						dp[i][j]=false;
					}
					if(j==0) {
						dp[i][j]=true;
					}
					continue;
				}
				int x = v.get(i-1);
				if(x<=j) {
					dp[i][j]=dp[i-1][j] || dp[i-1][j-x];
				}else {
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		if(dp[n][sum]) {
			System.out.println("There exists at least 1 subset with sum = " + sum);
		}else { 
			System.out.println("There's no subset with sum = "+sum);
		}
	}

}
