package com.arrays;

import java.util.Arrays;

public class Methods {
	public static void main(String[] args) {
		
//		toString()
		
		int[] arr = {10, 20, 30};
		System.out.println(Arrays.toString(arr));
		
		System.out.println("================");
		
//		sort()
		
		int[] arr1 = {50, 20, 40, 10, 30};
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("================");
		
//		equals()
		
		int[] x = {10, 20 , 30};
		int[] y = {10, 20 , 30};
		int[] z = {10, 30 , 20};
		
		boolean res = Arrays.equals(x, y);
		System.out.println(res);
		
		boolean res1 = Arrays.equals(y, z);
		System.out.println(res1);
		
		System.out.println("================");
		
//		mismatch()
		
		int[] m = {10, 20, 30};
		int[] n = {10, 20, 30};
		int[] o = {30, 20, 10};
		
		System.out.println(Arrays.mismatch(m, n));
		System.out.println(Arrays.mismatch(n, o));
		
		System.out.println("================");
		
//		binarySearch()
		
		int[] arr2 = {10, 20, 30, 40};
		System.out.println(Arrays.binarySearch(arr2, 30));
		System.out.println(Arrays.binarySearch(arr2, 50));
		System.out.println(Arrays.binarySearch(arr2, -100));
		
		System.out.println("================");
		
//		copyOfRange()
		
		int[] arr3 = {10, 20, 30, 40, 50};
		
		int[] res2 = Arrays.copyOfRange(arr3, 1, 5);
		System.out.println(Arrays.toString(res2));
		
		System.out.println("================");
		
//		other
		
		int[] arr4 = {10, 20, 30, 40};
		
		System.out.println(Arrays.hashCode(arr4));
		
		System.out.println(arr4.length);
		
	}
}
