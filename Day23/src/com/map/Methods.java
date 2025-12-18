package com.map;

import java.util.HashMap;
import java.util.Map;

public class Methods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//create a map
		Map<Integer, String> m1 = new HashMap<>();
		
		//put()
		//used to add new key and value pair (entries)
		m1.put(101, "ramu");
		m1.put(102, "kumar");
		m1.put(103, "anil");
		m1.put(104, "shivu");
		System.out.println(m1);
		
		//get()
		//used to fetch/get the value by passing key
		System.out.println(m1.get(101)); //ramu
		
		//size()
		//used to find total number of entries present in a map
		System.out.println(m1.size()); //4

		//conatinesKey()
		//used to check weather the key is present or not and returns output in the form of boolean.
		System.out.println(m1.containsKey(101)); //true
		System.out.println(m1.containsKey(100)); //false
		
		//conatinesValue()
		//used to check weather the value is present or not and returns output in the form of boolean.
		System.out.println(m1.containsValue("shivu")); //true
		System.out.println(m1.containsValue("abc"));  //false
		
		//keySet()
		//used to print all keys present in a map in the form of arrays
		System.out.println(m1.keySet()); // [101 , 102 , 103 , ...]
		
		//values()
		//used to print all the values present in a map in form of arrays
		System.out.println(m1.values()); // [value , .....]
		
		//entrySet()
		//used to print all the key and values (entry) pair in the form of array
		System.out.println(m1.entrySet());
		
		//remove()
		//used to remove/delete the key and value pair by passing key.
		m1.remove(101);
		System.out.println(m1);
		
		//isEmpty()
		//used to check weather the map is empty or not and returns output in form of boolean
		System.out.println(m1.isEmpty()); //false
		
		//clear()
		//used to erase all the key and value pair (entries) present in map
		m1.clear();
		System.out.println(m1); // {}
		System.out.println(m1.isEmpty()); //true
		
	}
		
}
