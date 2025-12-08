package com.string_builder;

public class Demo {
	public static void main(String[] args) {
		
//		Create a String using new keyword
		
		StringBuilder str = new StringBuilder("Hello World");
		System.out.println(str);
		
//		StringBuilder str1 = "Hello World";
//		System.out.println(str1); // Compile Time Error
		
		System.out.println("========================");
		
//		How to convert String into String Buffer
		
		String s1 = "Jai Shree Ram";
		System.out.println(s1);
		
		StringBuilder s2 = new StringBuilder(s1);
		System.out.println(s2);
		
		System.out.println("========================");
		
//		Pre-Defined Methods in StringBuffer
		
		StringBuilder s3 = new StringBuilder("java");
		System.out.println(s3);
		
		// append()
		
		System.out.println(s3.append(" script"));
		
		System.out.println("========================");
		
		// insert()
		
		System.out.println(s3.insert(4, "A"));
		System.out.println(s3.insert(1, "A"));
		
		System.out.println("========================");

		// delete()
		
		System.out.println(s3.delete(6, 13));
		
		System.out.println("========================");
		
		// reverse()
		
		System.out.println(s3.reverse());
		
		System.out.println("========================");
		
		// replace
		
		System.out.println(s3.replace(1, 6, "pple"));
	
	}
}
