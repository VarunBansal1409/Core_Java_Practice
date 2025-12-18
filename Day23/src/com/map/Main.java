package com.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		
		Map<Integer, String>  m1 = new HashMap<>();
		
		m1.put(101 , "ramu" );
		m1.put(102, "anil");
		m1.put(101, "kumar");
        m1.put(103, "kumar");
        m1.put(104, null);
        m1.put(105, null);
        m1.put(null, null);
        System.out.println(m1);
        
        Map<String, Integer> m2 = new HashMap<>();
        m2.put("abc@gmail.com", 101);
        m2.put("a1@gmail.com", 102);
        m2.put("b1@gmail.com", 102);
        m2.put("abc@gmail.com", 105);
        System.out.println(m2);
	}

}
