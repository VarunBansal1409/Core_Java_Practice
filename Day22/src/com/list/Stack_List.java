package com.list;

import java.util.Stack;

public class Stack_List {

	public static void main(String[] args) {

		// create a non generic stack
		Stack s1 = new Stack();
		s1.add("Java");
		s1.add(101);
		s1.add(45.67);
		s1.add('J');
		s1.add(true);
		s1.add(null);
		s1.add(null);
		System.out.println(s1); // [Java, 101, 45.67, J, true, null, null]
		
		// create a generic stack
		Stack<Integer> s2 = new Stack<Integer>();
		s2.add(1);
		s2.add(2);
		s2.add(3);
		s2.add(1);
		System.out.println(s2); // [1, 2, 3, 1]
		
//		Predefined methods of Stack class
		
		Stack<Integer> s3 = new Stack<Integer>();
		
		// push() - to add element at the top of the stack
		s3.push(10);
		s3.push(20);
		s3.push(30);
		s3.push(40);
		s3.push(50);
		System.out.println("Stack after push operations: " + s3); // [10, 20, 30, 40, 50]
		
		// peek() - to view the top element of the stack without removing it
		System.out.println(s3.peek()); // 50
		
		// pop() - to remove and return the top element of the stack
		s3.pop();
		System.out.println("Stack after pop operation: " + s3); // [10, 20, 30, 40]
		System.out.println(s3.peek()); // 40
		
	}

}
