package com.iterations;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_Iteration {

	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		System.out.println(a1); // [10, 20, 30, 40]

		ListIterator<Integer> res = a1.listIterator();
		System.out.println(res); // java.util.ArrayList$ListItr@6f539caf

		while (res.hasNext()) {
//			System.out.println(res.next());
			Integer i = res.next(); // explicit type casting because next() returns Object
			System.out.println(i);

			if (i.equals(10)) {
				res.add(11);
			} else if (i.equals(20)) {
				res.set(108);
			} else if (i.equals(30)) {
				res.remove();
			}
		}
		System.out.println(a1); // [10, 11, 108, 40]
		
		
//		while (res.hasPrevious()) {
//			System.out.println(res.next()); // No previous element exists at the start hence no printing
//		}
		
	}

}
