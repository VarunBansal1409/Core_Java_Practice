package com.set;

import java.util.TreeSet;

public class TreeSet_Set {
	public static void main(String[] args) {
		
		//create a treeset
		TreeSet  t1 = new TreeSet();
		t1.add(10);
		t1.add(60);
		t1.add(30);
		t1.add(20);
		t1.add(40);
		System.out.println(t1);
//		t1.add(null);  //NullPointerException
		System.out.println(t1);
		
		TreeSet<Integer> t2 = new TreeSet<>();
		t2.add(20);
		t2.add(50);
		t2.add(40);
		t2.add(10);
		t2.add(30);
//		t2.add(null);  //NullPointerException
		System.out.println(t2);
		
	}
}
