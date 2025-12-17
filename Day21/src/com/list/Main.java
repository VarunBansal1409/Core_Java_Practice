package com.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//create an object for list
//		List<> l1 = new ArrayList<>();
//		List<> l1 = new LinkedList<>();
//		List<> l1 = new Vector<>(); // less used in real time	
		
		List l1 = new ArrayList<>();
		l1.add(10);
		l1.add("hello");
		l1.add(true);
		l1.add('a');
		l1.add(10);
		l1.add(null);
		l1.add(null);
		System.out.println(l1);
	}

}

// note: List is an interface and ArrayList, LinkedList, Vector are the classes that implement the List interface.
