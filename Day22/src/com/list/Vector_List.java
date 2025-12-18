package com.list;

import java.util.Vector;

public class Vector_List {
	
	public static void main(String[] args) {
		
		// create a non generic vector
		Vector v1 = new Vector();
		v1.add("Hello");
		v1.add(123);
		v1.add(45.67);
		v1.add('X');
		v1.add(true);
		v1.add(null);
		v1.add(null);
		System.out.println(v1); // [Hello, 123, 45.67, X, true, null, null]
		
		// create a generic vector
		Vector<Integer> v2 = new Vector<Integer>();
		v2.add(10);
		v2.add(20);
		v2.add(30);
		v2.add(10);
		System.out.println(v2); // [10, 20, 30, 10]
		
	}

}
