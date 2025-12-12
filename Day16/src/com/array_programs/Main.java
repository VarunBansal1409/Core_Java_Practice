package com.array_programs;

public class Main {

	public static void main(String[] args) {

		// print array elements of prime number
		// A prime number is a natural number greater than 1 that cannot be formed by
		// prime number => 1 and itself

		int[] arr = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 1; j <= arr[i]; j++) {
				if (arr[i] % j == 0) {
					count = count + 1;
				}
			}
			if (count == 2) {
				System.out.println(arr[i] + " is a prime number");
			}
		}

		System.out.println("===================");

		// print array elements of perfect number
		// A perfect number is a positive integer that is equal to the sum of its proper

		// perfect number
		// 6 => 1 + 2 + 3 = 6
		// 28 => 1 + 2 + 4 + 7 + 14=> 28

		int[] arr1 = { 1, 2, 3, 6 };
		for (int i = 0; i < arr1.length; i++) {
			int num = arr1[i]; // 1 2 3 6
			int sum = 0;
			for (int j = 1; j < arr1[i]; j++) {  // 6 % 1 = sum = 1 , 6 % 2 = sum = 3
				if (num % j == 0) {
					sum = sum + j;
				}
			}
			if (sum == num) {
				System.out.println(num + " is a perfect number");
			}
		}
		
		System.out.println("=========");

		//reverse an array
		int[] arr2 = {1 , 2 , 3 , 4 , 5};
		for(int i=arr2.length-1; i>=0; i--  )
		{
			System.out.println(arr2[i]);
		}
	
	}
}
