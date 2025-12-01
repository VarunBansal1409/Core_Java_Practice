package com.excelr;

public class Demo {
	public static void main(String[] args) {

		// primitive data types
		// int
		int a1 = 10;
		System.out.println(a1);
		
		int a2 = -10;
		System.out.println(a2);
		
		//int a3 = 10.0;
		//System.out.println(a3);  //compile time error
		
		byte b1 = 10;
		System.out.println(b1);
		
		byte b2 = -10;
		System.out.println(b2);
		
		short s1 = 10;
		System.out.println(s1);
		
		short s2 = -10;
		System.out.println(s2);
		
		long l1 = 100;
		System.out.println(l1);
		
		long l2 = -10;
		System.out.println(l2);
		
		//cross the range of int data type
		long l3 = 12546546515L;
		System.out.println(l3);
		
		boolean b = true;
		System.out.println(b);
		
		boolean b3 = false;
		System.out.println(b3);
		
		//boolean b4 = 0;  //0 is int datatype
		//System.out.println(b4); //compile time error
		
		char c1 = 'a';
		System.out.println(c1); //a

		char c2 = 97;
		System.out.println(c2); //a
		
		char c3 = 65;
		System.out.println(c3); //A
		
		//char c4 = '97';
		//System.out.println(c4);  //compile time error
		System.out.println(Character.SIZE); //16
		
		//float
		float f1 = 10f;
		System.out.println(f1);
		
		float f2 = 10.5F;
		System.out.println(f2);
		
		//double
		double d1 = 10;
		System.out.println(d1);
		
		double d2 = 10.0;
		System.out.println(d2);

		//default values
		//int --> 0
		//byte  --> 0
		//short  --> 0
		//long  --> 0
		//boolean  --> false  	
		//char --> /u000
		//float --> 0f , 0F
		//double  --> 0d , 0D
		//String  --> null
		
		float f3 = 3e2f;
		System.out.println(f3);
		
		//integer into binary
		int res = 8;
		System.out.println(Integer.toBinaryString(res));
		
		int res1 = 10;
		System.out.println(Integer.toOctalString(res1));
		
		int res2 = 15;
		System.out.println(Integer.toHexString(res2));
		
	}
}
