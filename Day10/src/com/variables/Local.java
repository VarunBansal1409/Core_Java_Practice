package com.variables;

public class Local {
	
	static String name = "Vijay";
	
	public static void main(String[] args) {
		
		int a = 10; // local variable
		System.out.println(a);
		
//		int b;
//		System.out.println(b);
		
		String name = "Ritu";
		
		System.out.println(name);
		System.out.println(name);
		
		// print the static variable using class name
		
		System.out.println(Local.name);
		
	}
}
