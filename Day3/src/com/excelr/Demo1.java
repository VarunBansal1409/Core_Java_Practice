package com.excelr;
import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		
		//Implicit  type casting
		
		byte b = 10;
		float f = b;
		System.out.println(f);
		
		int i = 5;
		double d = i;
		System.out.println(d);
		
		//Explicit  type Casting
		int a = 65;
		char b1 = (char) a;
		System.out.println(b1);
		
		byte m1 = 97;
		char c2 = (char) m1;
		System.out.println(c2);
		
		float f1 = 10.0f;
		int f2 = (int) f1;  //explicit type casting
		System.out.println(f2);
		
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter a string");
	   String res2 = sc.nextLine();
	   System.out.println(res2);
	   sc.close();
	}
}
