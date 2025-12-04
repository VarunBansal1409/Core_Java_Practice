package com.itteration_statement;

public class Main {
	
	public static void main(String[] args) {
		
//		for loop
		
	
		for(int i=0; i<=5; i++) {
			System.out.println(i);
		}
		
		System.out.println("----------------------");
		
		for(int i=5; i>=0; i--) {
			System.out.println(i);
		}
		
		System.out.println("----------------------");
		
		for(int i=0; i<=10; i+=2)
		{
			System.out.println(i);
		}
		
		System.out.println("----------------------");
		
		String str = "hello world";
		
		for(int i = 0; i<str.length() ; i++)
		{
			System.out.println(str.charAt(i));
		}
		
		System.out.println("=====================");
		
//		while loop
		
		int a = 0;
		while(a<=5) {
			System.out.println(a);
			a++;
		}
		
		System.out.println("=======================");
		
//		do while loop
		
		int b = 3;
		do {
			System.out.println(b);
			b+=3;
		}while(b<=15);
		
		System.out.println("=======================");
		
//		nested for loop
		
		int rows = 5;
		int column = 5;
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<column; j++)
			{
				System.out.print(" □");
			}
			System.out.println();
		}
	}
}
