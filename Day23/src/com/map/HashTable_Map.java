package com.map;

import java.util.Hashtable;

public class HashTable_Map {
	public static void main(String[] args) {
		
		//create a object for hashtable
		
		Hashtable<Integer, String> h1 = new Hashtable<>();
		
		h1.put(101, "emp1");
		h1.put(105, "emp2");
//		h1.put(103, null);   //NullPointerException
	 	h1.put(null, null);  //NullPointerException
		h1.put(102, "emp3");
		h1.put(104, "emp3");
		System.out.println(h1);
		
	}
}
