
public class MyStringBuffer {
	private char[] s;
	private int length;
	
	MyStringBuffer() {
		s=new char[16];
		length=0;
	}

	MyStringBuffer(String s1) {
		length=s1.length();
		s=new char[length+16];
		for(int i=0;i<length;i++) {
			s[i]=s1.charAt(i);
		}
	}
	
	MyStringBuffer(int c) {
		s=new char[c];
		length=0;
	}
	
	int length() {
		return length;
	}
	
	int capacity() {
		return s.length;
	}
	
	public String toString() {
		char [] s1 = new char[this.length()];
		for(int i=0;i<this.length();i++) {
			s1[i]=s[i];
		}
		return new String(s1);
	}
	
	public void append(char[] s1) {
		append(new String(s1));
	}
	
	public void append(MyStringBuffer s1) {
		append(s1.toString());
	}

	public void append(char s1) {
		char[] temp=new char[this.capacity()+1];
		for(int i=0;i<length;i++) {
			temp[i]=s[i];
		}
		temp[length]=s1;
		length+=1;
		s=temp;
	}
	
	public void append(String s1) {
		if(s1==null) {
			this.append('n');
			this.append('u');
			this.append('l');
			this.append('l');
			return;
		}
		char[] temp=new char[this.capacity()+s1.length()];
		for(int i=0;i<length;i++) {
			temp[i]=s[i];
		}
		int j=0;
		for(int i=this.length();i<this.length()+s1.length();i++,j++) {
			temp[i]=s1.charAt(j);
		}
		length+=s1.length();
		s=temp;
	}
	
}
