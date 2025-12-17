package com.wrapperclass;

public class AutoBoxing {

	public static void main(String[] args) {

//		Auto Boxing

		// primitive data type
		int a = 10;
		System.out.println(a); // 10
		// convert into Wrapper class
		Integer res = a;
		System.out.println(res); // 10

		// primitive data type
		byte a1 = 100;
		System.out.println(a1); // 100
		// convert into Wrapper class
		Byte res1 = a1;
		System.out.println(res1); // 100

	}

}

// note: Auto Boxing is the automatic conversion that the Java compiler makes between the 
//			primitive data types and their corresponding object wrapper classes. 
//			For example, converting an int to an Integer, a double to a Double, and so on.