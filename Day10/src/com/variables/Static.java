package com.variables;

public class Static {
	
	static int a = 10;
	static String name = "Ramu";
	
	public static void main(String[] args) {
		
		// by using object
		
//		System.out.println(new Static().a);
//		System.out.println(new Static().name);
		
		System.out.println("=====================");
		
		// by using object reference
		
//		Static d = new Static();
//		System.out.println(d.a);
//		System.out.println(d.name);
		
		System.out.println("=====================");
		
		// directly
		
		System.out.println(a);
		System.out.println(name);
		
		System.out.println("=====================");
		
		// by using classname
		
		System.out.println(Static.a);
		System.out.println(Static.name);
	}
}
