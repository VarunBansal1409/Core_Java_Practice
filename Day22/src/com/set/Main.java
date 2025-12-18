package com.set;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		// create a non-generic Set
		Set s1 = new HashSet();
		s1.add(10);
		s1.add(20);
		s1.add("Hello");
		s1.add(true);
		s1.add(null);
		s1.add(null);
		s1.add(10);
		System.out.println(s1);
		
		// create a generic Set
		Set<Integer> s2 = new HashSet<Integer>();
		s2.add(10);
		s2.add(20);
		s2.add(30);
		s2.add(40);
		s2.add(10);
		System.out.println(s2);
		
	}
	
}
