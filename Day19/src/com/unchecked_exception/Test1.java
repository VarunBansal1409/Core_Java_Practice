package com.unchecked_exception;

public class Test1 {

	public static void main(String[] args) {

		// int a = 10;
		// int b = 0;
		// System.out.println(a / b); //ArithmeticException

		try {
			int a = 10;
			int b = 0;
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("we can't divide a number with zero");
		}

	}

}

// note : arithmetic exception occurs when we divide a number by zero
		// here we are handling the arithmetic exception using try-catch block