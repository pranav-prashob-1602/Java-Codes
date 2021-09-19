package com.pranav.assignments;

import java.util.*;

public class ScrambleWords {
	public static String scrambleWord(String s) {
		StringBuffer s1 = new StringBuffer(s);
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)=='A' && s.charAt(i+1)!='A') {
					s1.setCharAt(i, s.charAt(i+1));
					s1.setCharAt(i+1, s.charAt(i));
					i++;
			}
		}
		return s1.toString();
	}
	
	public static void scrambleOrRemove(List<String> wordList) {
		int n=wordList.size();
		for(int i=n-1;i>=0;i--) {
			String s=scrambleWord(wordList.get(i));
			if(s.equals(wordList.get(i))) {
				wordList.remove(i);
			}else {
				wordList.set(i, s);
			}
		}
	}
	
}
