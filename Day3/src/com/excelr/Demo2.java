package com.excelr;
import java.util.Scanner;

public class Demo2 {
	
	public static void main(String[] args) {
		
		//steps to create a Scanner class
		//step 1: import the Scanner class
		
		//step 2:create a object for Scanner Class
		// ClassName  objectReference/objectReferemceVariable = new ClassName();
		
		Scanner sc = new Scanner(System.in);
		
		//int
		System.out.println("enter any int value: ");
		int res = sc.nextInt();
		System.out.println("the int value is: "+res);
		
		//byte
		System.out.println("enter any byte value");
		byte res1 = sc.nextByte();
		System.out.println("the byte values is: "+res1);
		
		//short
		System.out.println("enter any short value");
		short res2 = sc.nextShort();
		System.out.println("the short values is: "+res2);
		
		//long
		System.out.println("enter any long value");
		long res3 = sc.nextLong();
		System.out.println(res3);
		
		//boolean
		System.out.println("enter any boolean value");
		boolean res4 = sc.nextBoolean();
		System.out.println(res4);
		
		//char
		System.out.println("enter any char value");
		char res5 = sc.next().charAt(0);
		System.out.println(res5);
		
		//float
		System.out.println("enter any float value");
		float res6 = sc.nextFloat();
		System.out.println(res6);
		
		//double
		System.out.println("enter any double value");
		double res7 = sc.nextDouble();
		System.out.println(res7);
		
		//string
		System.out.println("enter any string");
		String res8 = sc.next();
		System.out.println(res8);
		
		System.out.println("enter any string");
		String res9 = sc.nextLine();
		System.out.println(res9);
		
		sc.close();
		
	
	}

}
