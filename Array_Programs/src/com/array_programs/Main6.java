package com.array_programs;

import java.util.Arrays;

public class Main6 {
	
	public static void main(String[] args) {
		
		// write a java program to print even numbers in left side of an array and odd numbers in right side of an array.
		
		int[] arr = {12, 34, 45, 9, 8, 90, 3};
		int n = arr.length;
		System.out.println(Arrays.toString(arr));
		int[] store = new int[n];
		System.out.println(store.length);
		
		int evenIndex = 0;
		int oddIndex = n - 1;
		
		for(int i=0; i<n; i++) {
			if(arr[i] % 2 == 0) {
				store[evenIndex] = arr[i];
				evenIndex++;
			} else {
				store[oddIndex] = arr[i];
				oddIndex--;
			}
		}
		System.out.println(Arrays.toString(store));
		
		System.out.println("-----------------------------------");
		
		// write a java program to shift array elements to left side and first element to last position.
		
		int[] arr1 = {10, 20, 30, 40, 50};
		
		System.out.println(Arrays.toString(arr1)); // [10, 20, 30, 40, 50]
		
		int firstElement = arr1[0];
		
		for(int i=0; i<arr1.length-1; i++) {
			System.out.println(arr1[i+1]);
			arr1[i] =  arr1[i+1];
		}
		arr1[arr1.length-1] = firstElement;
		System.out.println(Arrays.toString(arr1)); // [20, 30, 40, 50, 10]
		
		
		System.out.println("-----------------------------------");
		
		// write a java program to find maximum number of an array.
		
		int[] arr2 = {50, 30, 80, 10, 40, 80};
		int max = arr2[0];
		for(int i=1; i<arr2.length; i++) {
			if(arr2[i] > max) {
				max = arr2[i];
			}
		}
		System.out.println("Maximum number in the array is: " + max);
		
		System.out.println("-----------------------------------");
		
		// write a java program to find minimum number of an array and count how many times it occurs.
		
		int[] arr3 = {20, 10, 50, 10, 30, 10, 40, 10};
		
		int min = arr3[0];
		int count = 1;
		
		for(int i=1; i<arr3.length; i++) {
			if(arr3[i] < min) {
				min = arr3[i];
			} else if(arr3[i] == min) {
				count++;
			}
		}
		System.out.println("Minimum number in the array is: " + min);
		System.out.println("Minimum number occurs " + count + " times in the array.");
	}
	
}
