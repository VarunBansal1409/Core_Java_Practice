package com.map;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMap_Map {
	public static void main(String[] args) {

		// create a object for linkedhashmap

		LinkedHashMap<Integer, String> l1 = new LinkedHashMap<>();
		l1.put(101, "emp1");
		l1.put(102, "emp2");
		l1.put(103, "emp3");
		l1.put(101, "emp4");
		l1.put(null, null);
		l1.put(107, null);
		l1.put(104, null);
		l1.put(105, "emp4");
		System.out.println(l1);

	}
}
