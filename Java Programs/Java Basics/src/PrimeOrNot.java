
public class PrimeOrNot {

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		boolean flag=false;
		for(int i=2;i*i<=n;i++) {
			flag|=(n%i==0);
			if(flag) {
				break;
			}
		}
		if(flag) {
			System.out.println("Not Prime");
		}else {
			System.out.println("Prime");
		}
	}
}
