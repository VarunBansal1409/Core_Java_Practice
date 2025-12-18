package com.iterations;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_Iteration {
	
	public static void main(String[] args) {
		
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		v1.add(50);
		System.out.println(v1); // [10, 20, 30, 40, 50]
		
		System.out.println(v1.elements()); // java.util.Vector$1@50040f0c
		
		Enumeration<Integer> e1 = v1.elements();
		System.out.println(e1); // java.util.Vector$1@2dda6444
		
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		
	}
	
}
