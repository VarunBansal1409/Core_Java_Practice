package com.wrapperclass;

public class Boxing {

	public static void main(String[] args) {

//		 Boxing

		// primitive data type
		int a = 100;
		System.out.println(a);
		// convert into Integer wrapper class
		Integer res = new Integer(a);
		System.out.println(res);

		// primitive data types
		float b = 10f;
		System.out.println(b);
		// convert into wrapper class
		Float res1 = new Float(b);
		System.out.println(res1);

//		using valueOf()

		// primitive data type
		int a1 = 10;
		System.out.println(a1);
		// convert into wrapper class
		Integer res2 = Integer.valueOf(a1);
		System.out.println(res2);

	}
}

// note: boxing is the process of converting a primitive data type into its corresponding wrapper class object. 
//		 it contains valueOf() method which is used for boxing.
		//			For example, converting an int to an Integer, a double to a Double, and so on.
