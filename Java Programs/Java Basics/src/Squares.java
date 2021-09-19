import java.util.Scanner;

public class Squares {

    int[][] square;

    //--------------------------------------
    //create new square of given size
    //--------------------------------------
    public Squares(int size) {
// intentionally left blank
    	square = new int[size][size];
    }

    //-----------------------------------------------
    //return the sum of the values in the given row
    //-----------------------------------------------
    public int sumRow(int row){
    	int sum=0;
    	for(int i=0;i<square[row].length;i++) {
    		sum+=square[row][i];
    	}
    	return sum;
    }

    //-------------------------------------------------
    //return the sum of the values in the given column
    //-------------------------------------------------
    public int sumCol(int col) {
// intentionally left blank
    	int sum=0;
    	for(int i=0;i<square.length;i++) {
    		sum+=square[i][col];
    	}
    	return sum;
    }

    //---------------------------------------------------
    //return the sum of the values in the main diagonal
    //---------------------------------------------------
    public int sumMainDiag(){
// intentionally left blank
    	int sum=0;
    	for(int i=0;i<square.length;i++) {
    		sum+=square[i][i];
    	}
    	return sum;
    }

    
    //---------------------------------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //---------------------------------------------------------------
    public int sumOtherDiag(){
// intentionally left blank
    	int sum=0;
    	int n=square.length;
    	for(int i=0;i<square.length;i++) {
    		sum+=square[i][n-i-1];
    	}
    	return sum;
    }

    //--------------------------------------------------------------
    //return true if the square is magic (all rows, cols, and 
    // diagonals have same sum), false otherwise
    //--------------------------------------------------------------
    public boolean magic() {
    	int checkSum = sumMainDiag();
    	boolean isMagic = sumOtherDiag() == checkSum;
	
    	// check rows
    	// Complete this code fragment for part B; for full credit use sumRow()			
		int sum=0;
    	for(int i=0;i<square.length;i++) {
			sum=0;
    		for(int j=0;j<square[i].length;j++) {
				sum+=square[i][j];
			}
    		isMagic&=(sum==checkSum);
		}
    	// check columns
    	// intentionally left blank
    	for(int i=0;i<square.length;i++) {
			sum=0;
    		for(int j=0;j<square[i].length;j++) {
				sum+=square[j][i];
			}
    		isMagic&=(sum==checkSum);
		}
    	return isMagic;
    }

    //----------------------------------------------------
    //read info into the square from the keyboard.
    //----------------------------------------------------
    public void fillSquare(Scanner scan) {
// intentionally left blank
    	for(int i=0;i<square.length;i++) {
    		for(int j=0;j<square[i].length;j++) {
    			square[i][j]=scan.nextInt();
    		}
    	}
    }

    //---------------------------------------------------
    //print the contents of the square, neatly formatted
    //---------------------------------------------------
    public void printSquare() {
// intentionally left blank
    	for(int i=0;i<square.length;i++) {
    		for(int j=0;j<square[i].length;j++) {
    			System.out.print(square[i][j]+" ");
    		}
    		System.out.println();
    	}
    }
}
