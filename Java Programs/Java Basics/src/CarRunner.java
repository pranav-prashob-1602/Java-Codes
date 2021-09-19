
public class CarRunner {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.seatCount();
		System.out.println(c1.wheelCount());
		c1.color();
		
		
		Vehicle v1 = new Car();		// This is called Run-time Dynamic Binding.
		v1.seatCount();
		System.out.println(v1.wheelCount());
		// v1.color();		--> this won't be allowed as a reference of Vehicle won't be having the method color(), hence can't call it. 
		// ^ This will be a COMPILE TIME ERROR.
		
		
	}

}
