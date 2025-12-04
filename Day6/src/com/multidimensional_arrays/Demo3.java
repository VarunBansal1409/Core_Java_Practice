package com.multidimensional_arrays;

public class Demo3 {
	public static void main(String[] args) 
	{
//		To perform operations of two multi dimensional arrays
		
		// Addition
		
		int[][] arr1 = {{10,20},{30,40}};
		int[][] arr2 = {{10,20},{30,40}};
		
		for(int i=0; i<arr1.length; i++) 
		{
			for(int j=0; j<arr1[i].length; j++)
			{
				System.out.print(arr1[i][j] + arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("=========================");
		
		// Subtraction
		
		int[][] arr3 = {{90,120},{300,2340}};
		int[][] arr4 = {{10,20},{30,40}};
		
		for(int i=0; i<arr3.length; i++) 
		{
			for(int j=0; j<arr4[i].length; j++)
			{
				System.out.print(arr3[i][j] - arr4[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("=========================");
		
		// Multiplication
		
		int[][] arr5 = {{0,12},{30,40}};
		int[][] arr6 = {{10,20},{30,4}};
		
		for(int i=0; i<arr5.length; i++) 
		{
			for(int j=0; j<arr5[i].length; j++)
			{
				System.out.print(arr5[i][j] * arr6[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("=========================");
		
//		Without Initialization and using another indentifier
		
		int[][] arr7 = new int[3][3];
		int value = 11;
		
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<3; j++)
			{
				arr7[i][j] = value;
				value+=11;
				
				System.out.print(arr7[i][j] + " ");
			}
			System.out.println();
		}
	}
}
