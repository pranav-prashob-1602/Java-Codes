
public class GiriStatic {
	static int cnt=11;
	int gi=10;
	static String name() {
		//return ("Priyanshu"+gi+"Giri"); //Doesn't have static reference
		return "Priyanshu "+cnt;
	}
}