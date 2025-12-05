package com.string;

import java.util.Arrays;

public class Methods {
	public static void main(String[] args) {
		String str = "hello";
		System.out.println(str);

		// length()
		System.out.println(str.length());
		
		System.out.println("=======================");

		// indexOf()
		System.out.println(str.indexOf('h'));
		
		System.out.println("=======================");

		// lastIndexOf()
		System.out.println(str.lastIndexOf("l"));
		
		System.out.println("=======================");

		// subString()
		System.out.println(str.substring(0, 3));
		
		System.out.println("=======================");

		// toCharArray()
		char[] res = str.toCharArray();
		System.out.println(Arrays.toString(res));
		
		System.out.println("=======================");

		// parseInt()
		String str1 = "123";
		System.out.println(str1);
		System.out.println(str1 + 5); // concatation
		
		int res1 = Integer.parseInt(str1);
		System.out.println(res1 + 5);

		String str2 = "onetwo";
		System.out.println(str2);

		try {
			int res2 = Integer.parseInt(str2);
			System.out.println(res2 + 10); // NumberFormatException
		} catch (NumberFormatException e) {
			System.out.println("string char's cann't converted into number");
		}
		
		System.out.println("=======================");

		// valueOf()
		int a = 10;
		System.out.println(a);
		System.out.println(a + 10);

		String b = String.valueOf(a);
		System.out.println(b);
		System.out.println(b + 10);
		
		System.out.println("=======================");

		// split()
		String str3 = "hello world";
		System.out.println(str3);

		String[] res5 = str3.split("");
		System.out.println(Arrays.toString(res5));

		String[] res6 = str3.split(" ");
		System.out.println(Arrays.toString(res6));

		String[] res7 = str3.split("l");
		System.out.println(Arrays.toString(res7));

		System.out.println("=======================");
		
		// concat()
		String str4 = "java";
		System.out.println(str4);

		String str5 = "script";
		System.out.println(str5);

		System.out.println(str4.concat(str5));
		
		System.out.println("=======================");

		// toUpperCase()
		System.out.println(str4.toUpperCase());
		
		System.out.println("=======================");

		// toLowerCase()
		String str6 = "JAVA";
		System.out.println(str6);
		System.out.println(str6.toLowerCase());
		
		System.out.println("=======================");

		// replace()
		String str7 = "java scrpit";
		System.out.println(str7);

		System.out.println(str7.replace("java", "react"));
		
		System.out.println("=======================");

		// replaceAll()
		String str8 = "java";
		System.out.println(str8);
		System.out.println(str8.replaceAll("java", "spring boot"));
		
		System.out.println("=======================");

		// startsWith()
		String str9 = "react";
		System.out.println(str9.startsWith("r"));
		
		System.out.println("=======================");

		// endWith()
		System.out.println(str9.endsWith("T"));
		
		System.out.println("=======================");

		// hashcode()
		System.out.println(str9.hashCode());
		
		System.out.println("=======================");

		// getBytes()
		String str10 = "abc";
		System.out.println(str10);

		byte[] res9 = str10.getBytes();
		System.out.println(Arrays.toString(res9));
		
		System.out.println("=======================");

		// charAt()
		String str11 = "hello";
		System.out.println(str11);
		System.out.println(str11.charAt(0));
		
		System.out.println("=======================");

		// equals()
		String a1 = "hello";
		System.out.println(a1);

		String a2 = "hello";
		System.out.println(a2);
		System.out.println(a1.equals(a2));
		
		System.out.println("=======================");

		// equalsIgnorCase()
		String b1 = "hello";
		System.out.println(b1);

		String b2 = "HELLO";
		System.out.println(b2);
		System.out.println(b1.equalsIgnoreCase(b2));
	}
}