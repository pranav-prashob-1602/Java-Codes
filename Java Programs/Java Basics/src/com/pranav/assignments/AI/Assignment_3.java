package com.pranav.assignments.AI;

import java.util.Scanner;
import java.util.Arrays;
 

public class Assignment_3 {
	
	static int n,m;
	
	
    private void fillGrid(int[][] g, int r, int c, int color, int newColor) {
        if(r<0 || c<0 || c>=n || r>=m || g[r][c]!=color) {
        	return;
        }
        g[r][c] = newColor;
        fillGrid(g, r + 1, c, color, newColor);
        fillGrid(g, r - 1, c, color, newColor);
        fillGrid(g, r, c + 1, color, newColor);
        fillGrid(g, r, c - 1, color, newColor);
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
 
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                g[i][j] = sc.nextInt();    
 
        System.out.println("Enter coordinates to start: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
 
        if(x<0 || x>=n || y<0 || y>=m) {
        	System.out.println("Invalid Input");
        	return;
        }
        
        System.out.println("Enter the new Color: ");
        int newColor = sc.nextInt();
        
        Assignment_3 ff = new Assignment_3();
        if(g[x][y]!=newColor) {
        	ff.fillGrid(g, x, y, g[x][y], newColor);            	
        }
        ff.display(g);
    }
}
