
public class MyStringBufferRunner {

	public static void main(String[] args) {
		MyStringBuffer s1 = new MyStringBuffer();
		System.out.println(s1.capacity());
		System.out.println(s1.length());
		MyStringBuffer s2 = new MyStringBuffer("Pranav");
		System.out.println(s2.capacity());
		System.out.println(s2.length());
		System.out.println(s2);
		
//		StringBuffer s = new StringBuffer();
//		System.out.println(s.capacity());
//		System.out.println(s.length());
//		String str=null;
//		s.append(str);
//		System.out.println(s);
		
		MyStringBuffer s3 = new MyStringBuffer(5);
		System.out.println(s3.capacity());
		System.out.println(s3.length());
		
		s2.append(" Prashob");
		System.out.println(s2);
		System.out.println(s2.capacity());
		System.out.println(s2.length());
		
		s2.append('a');
		System.out.println(s2);
		System.out.println(s2.capacity());
		System.out.println(s2.length());
		
		char[] temp = {'b','c','d'};
		s2.append(temp);
		
		
		System.out.println(s2);
		System.out.println(s2.capacity());
		System.out.println(s2.length());
		
		MyStringBuffer s6 = new MyStringBuffer("Pranav");
		String temp1 = null;
		s2.append(s6);
		System.out.println(s2);
		System.out.println(s2.capacity());
		System.out.println(s2.length());
		s1.append(temp1);
		System.out.println(s1);
//		MyStringBuffer s4 = new MyStringBuffer(5);
//		System.out.println(s3.capacity());
//		System.out.println(s3.length());
//		
	}

}
