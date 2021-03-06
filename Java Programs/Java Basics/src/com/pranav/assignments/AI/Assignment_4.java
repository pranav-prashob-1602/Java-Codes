package com.pranav.assignments.AI;

import java.util.*;
import java.util.Scanner;

public class Assignment_4 {
	
	static class Pair {
	    int x, y;
	     
	    public Pair(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }   
	}
	

	static int n, m;
	
	private boolean dfs(int dx, int dy, int x, int y, int[][] g) {
//		System.out.println(x+" "+ y);
		if(x<0 || x>=n || y<0 || y>=m || g[x][y]==1) {
			return false;
		}
		g[x][y]=1;
		if(x==dx && y==dy) {
			return true;
		}
		return dfs(dx, dy, x+1, y, g) || dfs(dx, dy, x-1, y, g) 
				|| dfs(dx, dy, x, y+1, g) || dfs(dx, dy, x, y-1, g);
	}
	
	private boolean bfs(int dx, int dy, int x, int y, int[][] g) {
		Queue<Pair> q = new LinkedList<Pair>();
		q.add(new Pair(x, y));
		g[x][y]=1;
		int[] dir = {-1, 0, 1, 0, -1}; 
		while(!q.isEmpty()) {
			Pair p = q.peek();
			q.remove();
			g[p.x][p.y]=1;
//			System.out.println(p.x+ " " + p.y);
			if(p.x==dx && p.y==dy) {
				return true;
			}
			for(int i=0;i<4;i++) {
				int tx = p.x+dir[i];
				int ty = p.y+dir[i+1];
				if(tx>=0 && tx<n && ty>=0 && ty<m && g[tx][ty]!=1) {
					q.add(new Pair(tx, ty));
				}
			}
		}
		return false;
	}
 
	private void display(int[][] g) {
        System.out.println("\nFinal Grid: \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
            	System.out.print(g[i][j] +" ");            	
            }
            System.out.println();
        }
    }
 
	
    
    public static void main(String[] args)  {
        Scanner sc = new Scanner( System.in );        
 
        System.out.println("Enter dimensions of grid: ");
        n = sc.nextInt();
        m = sc.nextInt();
 
        int[][] g = new int[n][m];
        for (int i = 0; i < n; i++) {
        	Arrays.fill(g[i], 0);        	
        }
 
        System.out.println("Input the grid: \n");
 
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < m; j++) {
        		g[i][j] = sc.nextInt();    
        	}  	
        }
        System.out.println("Enter starting coordinates: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
 
        if(x1<0 || x1>=n || y1<0 || y1>=m || g[x1][y1]==1) {
        	System.out.println("Invalid Input");
        	return;
        }
        
        System.out.println("Enter destination coordinates: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        if(x2<0 || x2>=n || y2<0 || y2>=m || g[x2][y2]==1) {
        	System.out.println("Invalid Input");
        	return;
        }
        int[][] t =  new int[n][m];
        
        for(int i=0; i<n; i++) {
        	for(int j=0; j<m; j++) {
        		t[i][j] = g[i][j];
        	}
        }
        
        Assignment_4 obj = new Assignment_4();
        if(obj.dfs(x2, y2, x1, y1, t)==true) {
        	System.out.println("Path Exists using DFS");
        }else {
        	System.out.println("Path doesn't Exist using DFS");
        }
        if(obj.bfs(x2, y2, x1, y1, g)==true) {
        	System.out.println("Path Exists using BFS");
        }else {
        	System.out.println("Path doesn't Exist using BFS");
        }
    }

}
