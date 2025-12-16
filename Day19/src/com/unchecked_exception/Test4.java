package com.unchecked_exception;

public class Test4 {
	public static void main(String[] args) {

		String str = null;
		System.out.println(str);
//		System.out.println(str.length());

		try {

			String str1 = null;
			System.out.println(str1);
			System.out.println(str1.length());
		} catch (NullPointerException e) {
			System.out.println("we can't find length of an default string");
		}

	}
}

// note : NullPointerException occurs when we try to perform any operation on a null object or default string
		// here we are handling the NullPointerException using try-catch block