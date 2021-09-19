
public class MyString {
		private char [] s;
		
		MyString() {
			s=null;
		}
		
		MyString(String a) {
			s=new char[a.length()];
			s=a.toCharArray();
		}
		
		MyString(MyString s2) {
			s = new char[s2.s.length];
			this.s = s2.s;
		}
		
		/*Copies characters from this MyString into the destination character array. 
	     The first character to be copied is at index srcBegin; the last character to be copied
	     is at index srcEnd-1 (thus the total number of characters to be copied is srcEnd-srcBegin).
	     The characters are copied into the subarray of dst starting at index dstBegin 
	     and ending at index: dstbegin + (srcEnd-srcBegin) - 1

	     Parameters:
	      srcBegin - index of the first character in the MyString to copy.
	      srcEnd - index after the last character in the MyString to copy.
	      dst - the destination array.
	      dstBegin - the start offset in the destination array.

	    Throws: 
	    IndexOutOfBoundsException - If any of the following is true: 
	    srcBegin is negative. 
	    srcBegin is greater than srcEnd 
	    srcEnd is greater than the length of this string 
	    dstBegin is negative 
	    dstBegin+(srcEnd-srcBegin) is larger than dst.length*/
		
		public void getChars(int l,int r, MyString s1, int ind) {
			if(r>this.length() || l>r || ind<0) {
				System.out.println("Exception : Index out of bounds");
				return;
			}
			s1.s = new char[ind+r-l];
			for(int i=ind,j=l;i<ind+r-l;i++,j++) {
				s1.s[i] = s[j];
			}
		}
		
		public String toString() {
			if(s==null) {
				return null;
			}
			return new String(s);
		}
		
		public char charAt(int i) {
			if(i<0 || i>=this.length()) {
				return '~';
			}
			return s[i];
		}
		
		public int length() {
			if(s==null) {
				return 0;
			}
			return s.length;
		}
		
		/*  Compares this MyString to the specified  object. The result is true 
	     if and only if the argument is not null and is a MyString object that
	     represents the same sequence of characters as this object. 
	      Overrides: equals in class Object

	      Parameters:
	      anObject - the object to compare this MyString against. 
	      Returns:
	      true if the MyString are equal; false otherwise.*/
		
		public boolean equals(Object s2) {
			String s1=s2.toString();
			if(s==null || s1==null || this.length()!=s1.length()) {
				return false;
			}
			for(int i=0;i<this.length();i++) {
				if(s[i]!=s1.charAt(i)) {
					return false;
				}
			}
			return true;
		}
		
		/* Compares two MyStrings lexicographically. The comparison is based on 
        the Unicode value of each character in the MyStrings. 
        The character sequence represented by this MyString object is 
        compared lexicographically to the character sequence represented by 
        the argument MyString. The result is a negative integer
        if this MyString object lexicographically precedes the argument MyString. 
        The result is a positive integer if this MyString object lexicographically
        follows the argument MyString. The result is zero if the MyStrings are equal; 
        compareTo returns 0 exactly when the equals(Object) method would return true. 
        If there is no index position at which they differ, then the shorter 
        MyString  lexicographically precedes the longer  MyString. 
        In this case, compareTo returns the difference of the lengths of
        the MyStrings -- that is, the value: this.length()-anotherMyString.length()
 
        Parameters:
	        anotherMyString - the MyString to be compared.
        Returns:
	        the value 0 if the argument MyString is equal to this MyString; 
                a value less than 0 if this MyString is  lexicographically less 
                than the MyString argument; and a value greater than 0 if this MyString is 
                lexicographically greater than the MyString argument.*/
		
		public int compareTo(MyString s2) {
			int mn;
			if(s2.length()<this.length()) {
				mn=s2.length();
			}else {
				mn=this.length();
			}
			for(int i=0;i<mn;i++) {
				if(s2.charAt(i)!=this.charAt(i)) {
					return (int)this.charAt(i) - (int)s2.charAt(i);
				}
			}
			if(this.length()>s2.length()) {
				return 1;
			}else if(this.length()==s2.length()) {
				return 0;
			}else {
				return -1;				
			}
		}
		
		public MyString toUpperCase() {
			MyString temp = new MyString(this);
			for(int i=0;i<temp.length();i++) {
				char ch=temp.charAt(i);
				if(ch>='a' && ch<='z') {
					temp.s[i]=(char)((int)ch-32);
				}
			}
			return temp;
		}
		
		public MyString toLowerCase() {
			MyString temp = new MyString(this);
			for(int i=0;i<temp.length();i++) {
				char ch=temp.charAt(i);
				if(ch>='A' && ch<='Z') {
//					System.out.println(ch+" "+z);
					temp.s[i]=(char)((int)ch+32);
				}
			}
//			System.out.println();
			return temp;
		}
		
		public MyString trim() {
			int i=0;
			while(this.charAt(i)=='\u0020' && i<this.length()) {		//		\u0020 is the UNICODE for ' ' (space) 
				i++;
			}
			if(i==this.length()) {
				return new MyString("");
			}
			int j=this.length()-1;
			while(this.charAt(j)=='\u0020' && j>=0) {
				j--;
			}
			MyString temp=new MyString();
//			System.out.println(j-i+1);
			temp.s = new char[j-i+1];
			int ind=i;
			for(int k=0;k<j-i+1;k++,ind++) {
				temp.s[k]=this.charAt(ind);
			}
			return temp;
		}
		
		/* Tests if this MyString starts with the specified prefix beginning a specified index. 

        Parameters:
	prefix - the prefix.
	toffset - where to begin looking in the MyString.
       
        Returns:
	true if the character sequence represented by the argument is a prefix of the subMyString 
	of this object 	starting at index toffset; false otherwise. The result is false if 
        toffset is negative or greater than the length	of this MyString object;
        otherwise the result is the same as the result of the expression 
        this.subMyString(toffset).startsWith(prefix)
          
       Throws:
	NullPointerException - if prefix is null.*/
		
		public boolean startsWith(MyString s1) {
			return startsWith(s1,0);
		}
		
		public boolean startsWith(MyString pref, int offset) {
			if(pref.length()>this.length()-offset) {
				return false;
			}
			int i=0,j=offset;
			while(i<pref.length() && j<this.length()) {
				if(pref.charAt(i)!=this.charAt(j)) {
					return false;
				}
				i++;
				j++;
			}
			return true;
		}
		
		public boolean endsWith(MyString suff) {
			if(suff.length()>this.length()) {
				return false;
			}
			int i=suff.length()-1,j=this.length()-1;
			while(i>=0 && j>=0) {
//				System.out.println(suff.charAt(i)+" "+this.charAt(j));
				if(suff.charAt(i)!=this.charAt(j)) {
					return false;
				}
				i--;
				j--;
			}
			return true;
		}
		
}
