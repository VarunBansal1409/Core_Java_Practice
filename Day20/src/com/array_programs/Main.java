package com.array_programs;

import java.util.Arrays;

public class Main {
	
	// program to sort an array without predefined methods both ascending and descending order
	// program to find first largest , second largest and smallest element in an array

	public static void main(String[] args) {
		
		int[] arr = {40 , 50 , 30 , 20 , 10 , 5};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j]) // ascending order
//				if(arr[i] < arr[j]) // descending order
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[arr.length-2]);  //second largest
		System.out.println(arr[arr.length-1]);  //first largest
		System.out.println(arr[arr.length-6]); //smallest element
		
	}
		
}
