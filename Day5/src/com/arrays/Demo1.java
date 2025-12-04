package com.arrays;

import java.util.Arrays;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		
		
//		array declaration and initialization at same time
		
		// int
		
		int[] arr = {10, 20, 30, 40, 50};
		System.out.println(arr);
		System.out.println("--------------");
		System.out.println(Arrays.toString(arr));		
		System.out.println("--------------");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("--------------");
		for(int arr1 : arr)
		{
			System.out.println(arr1);
		}
		
		System.out.println("======================");
		
		// String
		
		String[] str = {"abc" , "def" , "ghi" , "jkl" , "mno"};
		System.out.println(str);
		System.out.println("--------------");
		System.out.println(Arrays.toString(str));
		System.out.println("--------------");
		for(int i=0; i<str.length; i++)
		{
			System.out.println(str[i]);
		}
		System.out.println("--------------");
		for(String str1 : str)
		{
			System.out.println(str1);
		}
		
		System.out.println("======================");
		
		// Double
		
		Double[] dou = {1000.0 , 2000.0 , 3000.0};
		System.out.println(dou);
		System.out.println("--------------");
		System.out.println(Arrays.toString(dou));
		System.out.println("--------------");
		for(int i=0; i<dou.length; i++)
		{
			System.out.println(dou[i]);
		}
		System.out.println("--------------");
		for(Double dou1 : dou)
		{
			System.out.println(dou1);
		}
		
		System.out.println("======================");
		
		// char
		
		char[] ch = {'a' , 'b' , 'c'};
		System.out.println(ch);
		System.out.println("--------------");
		System.out.println(Arrays.toString(ch));
		System.out.println("--------------");
		for(int i=0; i<ch.length; i++)
		{
			System.out.println(ch[i]);
		}
		System.out.println("--------------");
		for(char ch1 : ch)
		{
			System.out.println(ch1);
		}
		
		System.out.println("======================");
		
		//input from end user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		int[] input = new int[size];
		System.out.println("Enter the Elements");
		for(int i=0; i<size; i++)
		{
			input[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(input));
	}
}
