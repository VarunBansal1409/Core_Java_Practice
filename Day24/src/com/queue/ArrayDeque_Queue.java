package com.queue;

import java.util.ArrayDeque;

public class ArrayDeque_Queue {

	public static void main(String[] args) {
		
		// create a object for ArrayDeque
		ArrayDeque d1 = new ArrayDeque();
		d1.add(10);
		d1.add(20);
		d1.add("Hello");
//		d1.add(null); // NullPointerException
		d1.add(40);
		d1.add(10); // duplicate allowed
		System.out.println(d1); // [10, 20, Hello, 40, 10]
		
		// generic ArrayDeque
		ArrayDeque<Integer> d2 = new ArrayDeque<Integer>();
		d2.add(100);
		d2.add(200);
		d2.add(300);
		System.out.println(d2); // [100, 200, 300]
		
		// add new element at first position (front end)
		d2.addFirst(50);
		System.out.println(d2); // [50, 100, 200, 300]
		
		// add new element at last position (rear end / tail end)
		d2.addLast(350);
		System.out.println(d2); // [50, 100, 200, 300, 350]
		
		// remove element in front end
		d2.removeFirst();
		System.out.println(d2); // [100, 200, 300, 350]
		
		// remove element in rear end / tail end
		d2.removeLast();
		System.out.println(d2); // [100, 200, 300]
		
	}
	
}