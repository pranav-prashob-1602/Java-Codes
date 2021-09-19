
public class Circle implements Drawable {
	
//	Drawable.pi = 5;		--> This is an error as pi is final, it's value cannot be changed
	
	public void draw() {
		System.out.println("Circles are circular");
	}
	
	public int area() {
		return pi*4;
	}
}
