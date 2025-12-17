package com.arraylist;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {

		// create a arraylist without generic type
		ArrayList a1 = new ArrayList<>();
		a1.add(10);
		a1.add("hello");
		a1.add(true);
		a1.add(null);
		a1.add(null);
		a1.add(10);

		System.out.println(a1);

		//implementing arraylist with generic type
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("ramu");
		a2.add("abhi");
		a2.add("anil");

		for (String res : a2) {
			System.out.println(res);
		}

		ArrayList<Integer> res1 = new ArrayList<>();
		res1.add(10);
		res1.add(20);
		res1.add(30);
		
		System.out.println(res1);
	}

}

// note: Here we are demonstrating the use of ArrayList with and without generics.
	// When using generics, we specify the type of elements the ArrayList will hold, ensuring type safety.