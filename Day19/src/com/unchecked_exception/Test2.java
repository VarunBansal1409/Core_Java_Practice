package com.unchecked_exception;

public class Test2 {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30 };
		System.out.println(arr[0]); // 10
		// System.out.println(arr[100]); //ArrayIndexOutOfBoundsException

		try {
			int[] arr1 = { 10, 20, 30 };
			System.out.println(arr1[100]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("we can't access an element out of range");
		}

	}

}

// note : ArrayIndexOutOfBoundsException occurs when we access an element outside the range of array
		// here we are handling the ArrayIndexOutOfBoundsException using try-catch block