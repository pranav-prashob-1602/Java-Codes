
public class Crossword {
	private Square[][] puzzle;
	
	public Crossword(boolean[][] blackSquares) {		
		puzzle= new Square[blackSquares.length][blackSquares[0].length];
		int num=1;
		for(int i=0;i<blackSquares.length;i++) {
			for(int j=0;j<blackSquares[i].length;j++) {
				if(toBeLabeled(i,j,blackSquares)==true) {
					puzzle[i][j]=new Square(blackSquares[i][j],num);
					num+=1;
				}else {
					puzzle[i][j]=new Square(blackSquares[i][j],0);
				}
			}
		}
	}
	
	public boolean toBeLabeled(int r, int c, boolean[][] blackSquares) {
		if((r>0 && blackSquares[r-1][c]) && (c>0 && blackSquares[r][c-1])) {
			return true;
		}else if(r==0 && c==0) {
			return !blackSquares[r][c];
		}else if(c==0) {
			return (r>0 && blackSquares[r-1][c]);
		}else if(r==0) {
			return (c>0 && blackSquares[r][c-1]);
		}else {
			return false;
		}
	}
	
	public void display() {
		for(int i=0;i<puzzle.length;i++) {
			for(int j=0;j<puzzle[i].length;j++) {
				System.out.print(puzzle[i][j].getNum()+" ");
			}
			System.out.println();
		}
	}
	
}
