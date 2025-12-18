package com.set;

import java.util.LinkedHashSet;

public class LinkedHashSet_Set {

	public static void main(String[] args) {
		
		// non generic LinkedHashSet
		// maintains insertion order
		LinkedHashSet l1 = new LinkedHashSet();
		l1.add(10);
		l1.add(20);
		l1.add(10);
		l1.add(null);
		l1.add(true);
		l1.add("Ramu");
		l1.add('d');
		l1.add(null);
		System.out.println(l1);
		
		// generic LinkedHashSet
		// maintains insertion order
		LinkedHashSet<Character> l2 = new LinkedHashSet<Character>();
		l2.add('R');
		l2.add('d');
		l2.add('R');
		l2.add('c');
		l2.add('B');
		l2.add('V');
		System.out.println(l2);
		System.out.println(l2.remove('d'));
	}
	
}
