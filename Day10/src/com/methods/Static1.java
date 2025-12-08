package com.methods;

import java.util.Scanner;

public class Static1 {
	
	static void isLargestNum(int a, int b, int c) {
		if(a>b && a>c) {
			System.out.println(a + " is greater than "+b+" and "+c );
		}else if(b>a && b>c) {
			System.out.println(b + " is greater than "+a+" and "+c );
		}else {
			System.out.println(c + " is greater than "+a+" and "+b );
		}
	}
	
	static String isEvenOdd(int num) {
		if(num % 2 == 0) {
			return "Even";
		}else {
			return "Odd";
		}
	}
	
	
	public static void main(String[] args) {
		
		Static1.isLargestNum(23, 97, 12);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers");
		int res = sc.nextInt();
		int res1 = sc.nextInt();
		int res2 = sc.nextInt();
		
		Static1.isLargestNum(res, res1, res2);
		
		System.out.println(Static1.isEvenOdd(res2));
	}
}
