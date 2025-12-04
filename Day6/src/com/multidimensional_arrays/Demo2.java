package com.multidimensional_arrays;

public class Demo2 {
	public static void main(String[] args) {
		
		int[][] arr = {{10,20,30},{40,50,60},{70,80,90}};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " "+" ");
			}
			System.out.println();
			System.out.println();
		}
		
		String[][] arr1 = {{"a","b","c"},{"x","y","z"}};
		
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr1[i].length; j++)
			{
				System.out.print(arr1[i][j] + " "+" ");
			}
			System.out.println();
			System.out.println();
		}
	}
}
