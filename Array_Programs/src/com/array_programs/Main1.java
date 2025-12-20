package com.array_programs;

import java.util.Arrays;

public class Main1 {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		
//		Print 1st, 2nd and last elements of an array

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		// System.out.println(arr[4]);
		System.out.println(arr[arr.length-1]);
		
		System.out.println("========================");
		
//		print 1st and last element of an array
		
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]);
		System.out.println(arr[0] + arr[arr.length-1]);
		
		System.out.println("========================");
		
//		to swap first and last element of an array
		
		//int a = 10;
		//int b = 20;
		
		//System.out.println("Before Swapping: "  +a+ " and " +b);
		
		// using 3rd variable
		
		//int temp = a;
		//a = b;
		//b = temp;
		
		//System.out.println("After Swapping: "  +a+ " and " +b);
		
		// without 3rd variable
		
		//a = a + b;
		//b = a - b;
		//a = a - b;
		
		//System.out.println("After Swapping: "  +a+ " and " +b);
		
		// using XOR
		
		//a = a^b;
		//b = a^b;
		//a = a^b;
		
		//System.out.println("After Swapping: "  +a+ " and " +b);
		
		int[] arr1 = {10,20,30,40,50};
		
		arr1[0] = arr1[0] ^ arr1[arr1.length-1];
		arr1[arr.length-1] = arr1[0] ^ arr1[arr1.length-1];
		arr1[0] = arr1[0] ^ arr1[arr1.length-1];
		
		System.out.println(Arrays.toString(arr1));
	}
}
