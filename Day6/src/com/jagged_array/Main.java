package com.jagged_array;

public class Main {
	public static void main(String[] args) {
		
		int[][] arr = {{10,20,30},{10,20},{20},{10,30,20,50}};
		
		for(int i=0; i<arr.length; i++) 
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
