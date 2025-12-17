package com.wrapperclass;

public class AutoUnBoxing {

	public static void main(String[] args) {

//    	Auto UnBoxing

		// Wrapper class
		Integer a = 10;
		System.out.println(a); // 10
		// convert into primitive data
		int res = a;
		System.out.println(res); // 10

		// Wrapper class
		Float b = 10.5f;
		System.out.println(b); // 10.5f
		// convert into primitive data
		float res1 = b;
		System.out.println(res1); // 10.5f
	}
}

// note: Auto UnBoxing is the automatic conversion that the Java compiler makes from
	//			the object wrapper classes to their corresponding primitive data types.
	// 			For example, converting an Integer to an int, a Double to a double, and so on.