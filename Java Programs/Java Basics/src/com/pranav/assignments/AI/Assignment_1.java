package com.pranav.assignments.AI;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_1 {

	static int[][] dp = new int[1001][1001];
	
	static int eggDropping(int n, int k) {
		if(k<=1) {
			return k;
		}
		if(n==1) {
			return k;
		}
		if(dp[n][k]!=-1) {
			return dp[n][k];
		}
		int mn=Integer.MAX_VALUE, res;
		for(int i=1;i<=k;i++) {
			res=1+Math.max(eggDropping(n-1, i-1), eggDropping(n, k-i));
			if(res<mn) {
				mn=res;
			}
		}
		dp[n][k]=mn;
		return mn;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		for(int i=0;i<dp.length;i++) {
			Arrays.fill(dp[i], -1);
		}
		System.out.println("Minimum number of tries needed in worst case is : " + eggDropping(n, k));
	}

}


