package com.array_programs;

public class Main7 {
	
	public static void main(String[] args) {
		
//		Find the leaders in an array
//		An element is leader if it is greater than the element to its right side.
		
		int[] a = {2, 3, 4, 7, 1};
		int leader = a[a.length - 1];
		System.out.print(leader + " ");
		for (int i = a.length - 2; i >= 0; i--) {
			if (a[i] > leader) {
				leader = a[i];
				System.out.println(leader + " ");
			}
		}
		
		System.out.println("=================");
		
//		To Print the duplicate elements in an array
		
		int[] arr1 = {1, 2, 3, 4, 2, 5, 3, 6, 1};
		System.out.print("Duplicate elements are: ");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] == arr1[j]) {
					System.out.print(arr1[i] + " ");
					break;
				}
			}
		}
		
	}
	
}
