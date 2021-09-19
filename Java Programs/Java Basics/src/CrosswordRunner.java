import java.util.*;


public class CrosswordRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,c;
		Scanner sc = new Scanner(System.in);
		r=sc.nextInt();
		c=sc.nextInt();
		boolean[][] isBlack = new boolean[r][c];
		System.out.println("Input the matrix representing the black squares :");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				int x=sc.nextInt();
				isBlack[i][j] = (x==1);
			}
		}
		
		Crossword c1 = new Crossword(isBlack);
		c1.display();
	}
}
