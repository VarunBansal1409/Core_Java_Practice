package com.map;

import java.util.TreeMap;

public class TreeMap_Map {
	public static void main(String[] args) {
		
		//create a object for treemap
		TreeMap<Integer, String> t1 = new TreeMap<>();
		
		//add key and value pair
		t1.put(105, "emp1");
		t1.put(104, "emp2");
		t1.put(101, "emp1");
		t1.put(103, "emp4");
		t1.put(102, "emp5");
		t1.put(108, null);
		t1.put(107, null);
//		t1.put(null, "emp6"); //NullPointerException
		System.out.println(t1);
		
		TreeMap<String, Integer> t2 = new TreeMap<>();
		t2.put("D", 101);
		t2.put("A", 102);
		t2.put("C", 103);
		t2.put("B", 104);
		System.out.println(t2);
		
		
	}
}		
