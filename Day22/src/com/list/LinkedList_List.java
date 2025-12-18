package com.list;

import java.util.LinkedList;

public class LinkedList_List {
	
	public static void main(String[] args) {
		
		// create a non generic linked list
		LinkedList l1 = new LinkedList();
		l1.add("Ramu");
		l1.add(null); 
		l1.add(null);
		l1.add(true);
		l1.add(10);
		System.out.println(l1);
		
		// create a generic linked list
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l2.add(100);
		l2.add(200);
		l2.add(300);
		l2.add(100);
		System.out.println(l2);
	}
}
                                                                                                                       