package com.string_buffer;

public class Demo {
	public static void main(String[] args) {

//		Create a String using new keyword
		
		StringBuffer str = new StringBuffer("Hello World");
		System.out.println(str);
		
//		StringBuffer str1 = "Hello World";
//		System.out.println(str1); // Error
		
		System.out.println("========================");
		
//		How to convert String into String Buffer
		
		String s1 = "Jai Shree Ram";
		System.out.println(s1);
		
		StringBuffer s2 = new StringBuffer(s1);
		System.out.println(s2);
		
		System.out.println("========================");
		
//		Pre-Defined Methods in StringBuffer
		
		StringBuffer s3 = new StringBuffer("java");
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
		
//		Convert the String into StringBuffer and Reverse the String
		
		String str2 = "Racecar";
		System.out.println(str2);
		
		StringBuffer str3 = new StringBuffer(str2);
		System.out.println(str3);
		
		System.out.println(str3.reverse());
		
		System.out.println("========================");

//		Prove String is a immutable and String Buffer is mutable
		
		// String
		
		String a1 = "Java";
		System.out.println(a1);
		System.out.println(System.identityHashCode(a1)); //1706234378
		
		a1 = a1.concat(" Script");
		System.out.println(a1);
		System.out.println(System.identityHashCode(a1)); //1867750575
		
		System.out.println("----------------------------");
		
		// StringBuffer
	
		StringBuffer a2 = new StringBuffer("Java");
		System.out.println(a2);
		System.out.println(System.identityHashCode(a2)); //2046562095
		
		a2.append(" Script");
		System.out.println(a2);
		System.out.println(System.identityHashCode(a2)); //2046562095
	}
}
