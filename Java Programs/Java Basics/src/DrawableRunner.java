
public class DrawableRunner {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.draw();
		System.out.println(r1.area());
		Drawable d1 = new Rectangle();		// Dynamic binding
		d1.draw();
		System.out.println(d1.area());
		
		Circle c1 = new Circle();
		c1.draw();
		System.out.println(c1.area());
		
		Drawable d2 = new Circle();		// Dynamic binding
		d2.draw();
		System.out.println(d2.area());
		
	}

}
