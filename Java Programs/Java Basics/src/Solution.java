import java.util.*;

class Shape {
    public int length, breadth;
    
    public Shape(int l, int b) {
        length = l;
        breadth = b;
    }
    
    void area() {
        System.out.println(length+" "+breadth);
    }
    
}

class Rectangle1 extends Shape{
    public Rectangle1(int l, int b) {
        super(l, b);
    }
    
    void area() {
    	super.area();
        System.out.println(length*breadth);
    }
}


public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        Rectangle1 r = new Rectangle1(l, b);
        r.area();
    }
}