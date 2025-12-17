package com.wrapperclass;

public class UnBoxing {

	public static void main(String[] args) {
//		 UnBoxing
		
		// wrapper class
		Integer a = 10;
		System.out.println(a);
		// convert into primitive data type
		int res = a;
		System.out.println(res);

		// wrapper class
		Character ch = 'a';
		System.out.println(ch);
		// convert into primitive data types
		char res1 = ch;
		System.out.println(res1);

//		 by using in-built method(Value())
		
		// wrapper class
		Integer a1 = 100;
		System.out.println(a1);
		// convert into primitive data type
		int res2 = a1.intValue();
		System.out.println(res2);

		// wrapper class
		Float b1 = 10f;
		System.out.println(b1);
		// convert into primitive data
		float res3 = b1.floatValue();
		System.out.println(res3);
	}

}

// note: UnBoxing is the process of converting a wrapper class object back into its corresponding primitive data type.
		//		 it contains in-built method like intValue(), floatValue() etc which is used for unboxing.
		//			For example, converting an Integer to an int, a Double to a double, and so on.
