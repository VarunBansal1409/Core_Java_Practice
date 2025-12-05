package com.string;

public class Demo {
	
	public static void main(String[] args) {
		
		//by using literal way
		String str = "hello";
		System.out.println(str);
		System.out.println(System.identityHashCode(str)); //1706234378
		
		String str1 = "hello";
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1)); //1706234378
		
		//by using new keyword
		String str2 = new String("react");
		System.out.println(str2);
		System.out.println(System.identityHashCode(str2)); //1867750575
		
		String str3 = new String("react");
		System.out.println(str3);
		System.out.println(System.identityHashCode(str3)); //2046562095
		
		System.out.println("=================");
		//== and equals()
		
		String s1 = new String("java");
		System.out.println(s1);
		
		String s2 = new String("java");
		System.out.println(s2);
		
		System.out.println(s1 == s2); //false
		
		System.out.println(s1.equals(s2)); //true
		
	   
		

		
	}
	
}
