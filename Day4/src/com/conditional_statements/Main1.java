package com.conditional_statements;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		
//		else-if-else
		// check the input is character, number or special char
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Char");
//		char res = sc.next().charAt(0);
		char ch = 'B';
		if(ch >= 'a' && ch <= 'z') {
			System.out.println(ch+" is a lower case");
		}else if(ch >= 'A' && ch <= 'Z') {
			System.out.println(ch+ " is a uppar case");
		}else if(ch >= '0' && ch <= '9') {
			System.out.println(ch+" is a number");
		}else {
			System.out.println(ch+ " is a special char");
		}
		
		System.out.println("======================");
		
		// convert lowercase into uppercase and vice-versa
		
		char a = 97;
		System.out.println(a);
		char b = 65;
		System.out.println(b);
		
		int cha = 65 + 32;
		System.out.println(cha);
		char cha1 = (char) 97;
		System.out.println(cha1);
		
		System.out.println("--------------------------");
		
		int cha2 = 97 - 32;
		System.out.println(cha2);
		char cha3 = (char) 65;
		System.out.println(cha3);
		
		System.out.println("=============================");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m Value");
		int m = sc.nextInt();
		
		System.out.println("Enter n Value");
		int n = sc.nextInt();
		
		System.out.println("Enter o Value");
		int o = sc.nextInt();
		
		if(m > n && m > o) {
			System.out.println("m is greatest");
		}else if(n > m && n > o) {
			System.out.println("n is greatest");
		}else {
			System.out.println("o is greatest");
		}
	}
}
