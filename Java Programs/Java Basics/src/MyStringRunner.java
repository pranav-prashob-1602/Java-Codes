
public class MyStringRunner {
	public static void main(String[] args) {
		MyString s1=new MyString();
		System.out.println(s1);
		MyString s2=new MyString("Pranav");
		System.out.println(s2);
		MyString s3=new MyString(s2);
		System.out.println(s3);
		MyString s4=new MyString();
		s3.getChars(1,6,s4,0);
		System.out.println(s4);
		System.out.println(s2.equals(s3));
		System.out.println(s2.equals(s1));
		MyString a=new MyString("ADAA");
		MyString b=new MyString("AAAA");
		System.out.println(a.compareTo(b));
		MyString s5= a.toLowerCase();
		System.out.println(s5);
		MyString s6= s5.toUpperCase();
		System.out.println(s6);
		MyString s7= new MyString("   I am Pranav  ");
		System.out.println(s7);
		MyString s8= s7.trim();
		System.out.println(s8);
		MyString s9 = new MyString("I ");
		MyString s10 = new MyString("am");
		System.out.println(s8.startsWith(s9));
		System.out.println(s8.startsWith(s10,2));
		MyString s11 = new MyString("nav");
		MyString s12 = new MyString("I am Pranav");
		System.out.println(s8.endsWith(s11));
		System.out.println(s8.endsWith(s12));
	}
}
