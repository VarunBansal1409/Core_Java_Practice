package com.string_tokenizer;

import java.util.StringTokenizer;

public class Demo {
	public static void main(String[] args) {
		
//		Create a StringTokenizer using new keyword
		
		StringTokenizer str = new StringTokenizer("I Am StringTokenizer");
		System.out.println(str);
		
//		Create a StringTokenizer using Literal Method
		// StringTokenizer str1 = "Hello World";
		// System.out.println(str1); // compilation error
		
		System.out.println("=======================");
		
		System.out.println(str.hasMoreElements());
		
		System.out.println("------------------");
		
		System.out.println(str.nextElement());
		System.out.println(str.nextElement());
		
		System.out.println("------------------");
		
		System.out.println(str.countTokens());
		
		System.out.println("------------------");
		
		System.out.println(str.hasMoreTokens());
		
		System.out.println("------------------");
		
		System.out.println(str.nextToken());
//		System.out.println(str.nextToken());
		
		System.out.println("=======================");
		
		StringTokenizer s1 = new StringTokenizer("This is using iterating statement");
		System.out.println(s1);
		
		System.out.println("=======================");
		
		System.out.println(s1.countTokens());
		
		System.out.println("------------------");
		
//		System.out.println(s1.hasMoreElements());
//		
//		System.out.println("------------------");
//		
//		System.out.println(s1.nextElement());
//		System.out.println(s1.nextElement());
//		
//		System.out.println("------------------");
//		
//		while(s1.hasMoreElements())
//		{
//			System.out.println(s1.nextElement());
//		}
		
		
		System.out.println(s1.hasMoreTokens());
		
		System.out.println("------------------");
		
		System.out.print(s1.nextToken() + " ");
		System.out.println(s1.nextToken());
		
		System.out.println("------------------");
		
		while(s1.hasMoreTokens())
		{
			System.out.print(s1.nextToken() + " ");
		}
		
		
	}
}
