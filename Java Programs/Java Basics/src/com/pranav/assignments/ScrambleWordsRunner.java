package com.pranav.assignments;

import java.util.*;

public class ScrambleWordsRunner {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String> ();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
//			System.out.println("1");
			String s=sc.nextLine();
			l.add(s);
		}
		ScrambleWords.scrambleOrRemove(l);
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
	}

}
