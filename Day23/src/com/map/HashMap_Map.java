package com.map;

import java.util.HashMap;

public class HashMap_Map {
	
	public static void main(String[] args) {
		
		//create a object for hashmap
		HashMap<Integer, String> h1 = new HashMap<>();
		
		h1.put(101, "abc");
		h1.put(102, "ramu");
		h1.put(101, "xyz");
		h1.put(null, null);
		h1.put(103, null);
		h1.put(104, null);
		h1.put(105, "mno");
		h1.put(null, "pqr");
		System.out.println(h1);
		
		
	}

}
