package com.unchecked_exception;

public class Test3 {

	public static void main(String[] args) {

		String str = "123";
		System.out.println(str);

		// convert string into integer
		int res = Integer.parseInt(str);
		System.out.println(res);

		String str1 = "abc";
		System.out.println(str1);

		// convert string into integer
//		int res1 = Integer.parseInt(str1);
		// System.out.println(res1); //NumberFormatException

		try {
			String str2 = "abc";
			System.out.println(str2);

			// convert string into integer
			int res2 = Integer.parseInt(str2);
			System.out.println(res2);

		} catch (NumberFormatException e) {
			System.out.println("we can't convert string (alphabet , symboll) into integer");
		}

	}

}

// note : NumberFormatException occurs when we try to convert a string (alphabet , symboll) into integer
		// here we are handling the NumberFormatException using try-catch block
