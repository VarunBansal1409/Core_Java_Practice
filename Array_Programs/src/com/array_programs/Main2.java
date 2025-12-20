package com.array_programs;

public class Main2 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };

		// print the array elements
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]); // values
			System.out.println(i); // index
		}

		System.out.println("===================");
		//to find and count event numbers
		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] % 2 == 0) {
				System.out.println(arr1[i]);
				count++;
			}
		}
		System.out.println("count of even number is: "+count);
		
		System.out.println("=============");
		//to find and count the odd number
		int[] arr2 = { 1, 2, 3, 4, 5, 6 };
		int count1 = 0;
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] % 2 != 0) {
				System.out.println(arr2[i]);
				count1++;
			}
		}
		System.out.println("count of odd number is: "+count1);
		
		//to find sum of an array
		int[] arr3 = {10 , 20 , 30 , 40};
		int sum = 0;
		
		for(int i=0; i<arr3.length; i++)
		{
			sum = sum + arr3[i];
		}
		System.out.println("the total sum of an arry is: "+sum);

	}
}
