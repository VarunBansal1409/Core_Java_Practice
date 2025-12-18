package com.set;

import java.util.HashSet;

public class HashSet_Set {

	public static void main(String[] args) {
		
		// non-generic HashSet
		// does not maintain insertion order
		HashSet h1 = new HashSet();
		h1.add(10);
		h1.add(20);
		h1.add(10);
		h1.add(null);
		h1.add(true);
		h1.add("Ramu");
		h1.add('d');
		h1.add(null);
		System.out.println(h1);
		
		// generic HashSet
		// does not maintain insertion order
		HashSet<String> h2 = new HashSet<String>();
		h2.add("Ramu");
		h2.add("Dhileep");
		h2.add("Ramu");
		h2.add("Chandu");
		h2.add("Balu");
		h2.add("Vijju");
		System.out.println(h2);
	}
	
}
