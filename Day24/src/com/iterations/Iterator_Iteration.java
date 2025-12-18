package com.iterations;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Iteration {

	public static void main(String[] args) {
		
		// create a object for ArrayList
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		System.out.println(a1); // [10, 20, 30, 40, 50]
		
		Iterator<Integer> res = a1.iterator();
		System.out.println(res); // java.util.ArrayList$Itr@65b3120a
		
		while(res.hasNext())
		{
			Integer i = (Integer) res.next(); // explicit type casting because next() returns Object
			System.out.println(i); // 10 20 30 40 50
//			System.out.println(res.next()); // 10 20 30 40 50
			if(i % 4 == 0)
			{
				res.remove();
				System.out.println(a1);
			}
		}
	}
	
}
