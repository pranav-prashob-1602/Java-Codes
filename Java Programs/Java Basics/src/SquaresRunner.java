import java.util.*;


public class SquaresRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the Size of the 2-D Array : ");
			int sz = sc.nextInt();
			Squares s1 = new Squares(sz);
			s1.fillSquare(sc);
			s1.printSquare();
			System.out.println(s1.sumRow(0));
			System.out.println(s1.sumCol(1));
			System.out.println(s1.sumMainDiag());
			System.out.println(s1.sumOtherDiag());
			System.out.println(s1.magic());
	}

}
