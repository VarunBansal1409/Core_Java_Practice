package com.arrays;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		
//		array declaration and initialization differently
		
		int[] arr = new int[5];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
//		arr[5] = 60; //ArrayIndexOutOfBoundsException
		
		System.out.println(arr);
		
		// using tostring
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[2]);
		
		System.out.println("---------------------------");
		
		// using for loop
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("---------------------------");
		
		//using for each loop
		
		for(int arr1 : arr) {
			System.out.println(arr1);
		}
	}
}
