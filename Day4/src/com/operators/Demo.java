package com.operators;

public class Demo {
	public static void main(String[] args) {
		
		// Arithmetic Operators
		System.out.println(10+10);
		System.out.println(10-10);
		System.out.println(10*10);
		System.out.println(10/2);
		System.out.println(10%3);
		
		System.out.println("========================");
		
		// Incrementation and Decrementation
		
//		Increment
		// it will increment value by 1.
		//1) post-increment
		//2) pre-increment
		
		//1)post-increment
		// first value is assigned then value will be incremented
		// it will be implemented for next operation
		
		int a = 5;
		int b = a++;
		
		System.out.println(a);
		System.out.println(b);
		
		//2)pre-increment
		// first increment has been done then the value will be assigned
		// it will be implemented for current operation
		
		int c = 5;
		int d = ++c;
		
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("-----------------------");
		
//		Decrement
		// it will decrement value by 1.
				//1) post-decrement
				//2) pre-decrement
				
				//1)post-decrement
				// first value is assigned then value will be decremented
				// it will be implemented for next operation
				
				int e = 5;
				int f = e++;
				
				System.out.println(e);
				System.out.println(f);
				
				//2)pre-decrement
				// first decrement has been done then the value will be assigned
				// it will be implemented for current operation
				
				int g = 5;
				int h = --g;
				
				System.out.println(g);
				System.out.println(h);
				
				System.out.println("====================");
				
				// Assignment Operators
				
				int a1 = 5;
				int b1 = 5;
				
				System.out.println(a1+=b1); //10  //a1 = a1 + b1
				System.out.println(a1-=b1); //5  //a1 = a1 - b1
				System.out.println(a1*=b1); //25  //a1 = a1 * b1
				System.out.println(a1/=b1); //5  //a1 = a1 / b1
				System.out.println(a1%=b1); //0  //a1 = a1 % b1
				
				System.out.println("======================");
				
				// Relational Operators
				
				System.out.println(7 == 7); //true
				System.out.println(7 < 108); //true
				System.out.println(108 > 7); //true
				System.out.println(7 >= 7); //true
				System.out.println(108 <= 108); //true
				System.out.println(7 != 7); //false
				
				System.out.println("======================");
				
				// Bitwise Operators
				
//				left bitwise
				
				int a2 = 5;
				System.out.println(a2);
				int b2 = 2;
				System.out.println(b2);
				System.out.println(a2 << b2);
				
				System.out.println("--------------------------");
				
//				right bitwise
				
				int c2 = 5;
				System.out.println(c2);
				int d2 = 2;
				System.out.println(d2);
				System.out.println(c2 >> d2);
				
				System.out.println("--------------------------");
				
//				bitwise complementry
				
				int e2 = 5;
				System.out.println(e2);
				System.out.println(~(e2));
				
				System.out.println("--------------------------");
				
//				bitwise AND
				
				int f2 = 5;
				System.out.println(f2);
				int g2 = 4;
				System.out.println(g2);
				System.out.println(f2 & g2);
				
				System.out.println("--------------------------");
				
//				bitwise OR
				
				int h2 = 5;
				System.out.println(h2);
				int i2 = 11;
				System.out.println(i2);
				System.out.println(h2 | i2);
				
				System.out.println("--------------------------");
				
//				bitwise XOR
				
				int j2 = 7;
				System.out.println(j2);
				int k2 = 13;
				System.out.println(k2);
				System.out.println(j2 ^ k2);
				
				System.out.println("===========================");
				
				// Logical Operators
				
//				AND 
				
				System.out.println(true && true);
				System.out.println(true && false);
				System.out.println(false && true);
				System.out.println(false && false);
				
				System.out.println("-------------------------");
				
//				OR
				
				System.out.println(true || true);
				System.out.println(true || false);
				System.out.println(false || true);
				System.out.println(false || false);
				
				System.out.println("-------------------------");
				
//				NOT
				
				System.out.println(!true);
				System.out.println(!false);
				
				System.out.println("==========================");
				
				// Ternary Operators
				
				String a3 = 5 > 3 ? "5 is greater" : "5 is lesser";
				System.out.println(a3);
				
				String b3 = 5 > 12 ? "5 is greater" : "5 is lesser";
				System.out.println(b3);

	}
}
