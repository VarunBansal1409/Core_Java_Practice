package com.array_programs;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		// check whether a target element is present in an array or not
		int[] arr = { 34, 12, 5, 67, 23, 89, 1, 45 };
		int target = 23;
		boolean found = false;

		for (int i = 0; i < arr.length; i++) {

			if (target == arr[i]) {
				found = true;
				System.out.println("Target: " + arr[i] + " is present");
				break;
			}

		}
		if (!found) {
			System.out.println("Target Not found");
		}

		System.out.println("======================");

		// write a program to copy all elements from one array to another array

		int[] arr1 = { 10, 20, 30, 40, 50 };
		System.out.println(Arrays.toString(arr1)); // [10, 20, 30, 40, 50] <-- original array
		System.out.println("Length of arr1: " + arr1.length); // Length of arr1: 5
		int[] res = new int[arr1.length];

		for (int i = 0; i < res.length; i++) {
			res[i] = arr1[i];
		}
		System.out.println(Arrays.toString(res)); // [10, 20, 30, 40, 50] <-- copied array

		System.out.println("======================");

		// write a program to merge two arrays

		int[] a1 = { 1, 3, 5 };
		int[] a2 = { 2, 4, 6, 8, 10 };
		int[] merged = new int[a1.length + a2.length];

		for (int i = 0; i < a1.length; i++) {
			merged[i] = a1[i];
		}

		System.out.println(Arrays.toString(merged));

		for (int i = 0; i < a2.length; i++) {
			merged[i + a1.length] = a2[i];
		}

		System.out.println(Arrays.toString(merged));
	}

}
