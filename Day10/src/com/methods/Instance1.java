package com.methods;

import java.util.Scanner;

public class Instance1 {

	void isEvenOdd(int num) {
		
		if(num % 2 == 0) {
			System.out.println(num + " is an even number");
		}else {
			System.out.println(num + " is an odd number");
		}
			
	}
	
	String isOddEven(int num) {
		if(num % 2 == 0) {
			return "Even";
		}else {
			return "Odd";
		}
	}
	
	public static void main(String[] args) {
		
		Instance1 i = new Instance1();
		
		i.isEvenOdd(17);
		System.out.println(i.isOddEven(21));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int res = sc.nextInt();
		
		i.isEvenOdd(res);
		System.out.println(i.isOddEven(res));
		
	}
	
}
