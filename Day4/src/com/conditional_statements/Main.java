package com.conditional_statements;

public class Main {
	public static void main(String[] args) {
		
//		Simple if
		
		int a = 12;
		if(a > 5)
		{
			System.out.println("a is greater");
		}
		
		System.out.println("======================");
		
//		is-else
		
		int b = 2;
		if(b > 7)
		{
			System.out.println("b is greater");
		}else {
			System.out.println("b is lesser");
		}
		
		System.out.println("======================");
		
		// to find the given char is vowel or not 
		// a e i o u  A E I O U
		
		char ch = 'a';
		if((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') || (ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U'))
		{
			System.out.println(ch+" is a vowel");
		}else {
			System.out.println(ch+ "is not a vowel");
		}
		
		System.out.println("======================");
		
		// to check whether the given year is a leap year not
		
		int year = 3000 ;
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year+ " is a leap year");
		}else {
			System.out.println(year+ " is not a leap year");
		}
	}
}
