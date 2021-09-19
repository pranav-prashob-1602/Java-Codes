
public class Car extends Vehicle{
	int wheelCount() {
//		Circle c1;
//		c1.draw();	-->for StackTraceException
		return 4;
	}
	
	void seatCount() {
		System.out.println("There are 4 seats");
	}
	
	void color() {
		System.out.println("Blue");
	}
	
}
