package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Methods {

	public static void main(String[] args) {

		// add()
		// used to add elements to the list
		ArrayList a1 = new ArrayList();
		a1.add("Apple");
		a1.add(10);
		a1.add(15.5);
		a1.add('A');
		a1.add(true);
		a1.add(null);
		a1.add(null);
		System.out.println(a1); // [Apple, 10, 15.5, A, true, null, null]

		
		System.out.println("--------------");
		// addAll()
		// used to add multiple elements to the list
		ArrayList a2 = new ArrayList();
		a2.add("Banana");
		a2.add(20);
		a2.addAll(a1);
		// a2.addAll(20 , 40, 60); // error
		System.out.println(a2); // [Banana, 20, Apple, 10, 15.5, A, true, null, null]

		
		System.out.println("--------------");
		// get()
		// used to get the element at the specified index
		System.out.println(a1.get(0)); // Apple

		
		System.out.println("--------------");
		// set()
		// used to update the element at the specified index
		a1.set(0, "Mango");
		System.out.println(a1); // [Mango, 10, 15.5, A, true, null, null]

		
		System.out.println("--------------");
		// indexOf()
		// used to get the index of the specified element
		System.out.println(a1.indexOf("Mango"));	// 0
		System.out.println(a1.indexOf(null)); // 5
		System.out.println(a1.indexOf(10000)); // -1 if element not found

		
		System.out.println("--------------");
		// lastIndexOf()
		// used to get the last index of the specified element
		System.out.println(a1.lastIndexOf(null));
		System.out.println(a1.lastIndexOf("Book")); // -1 if element not found
		
		
		System.out.println("--------------");
		// contains()
		// used to check if the specified element is present or not and returns boolean value
		System.out.println(a1.contains("Mango")); // true
		System.out.println(a1.contains("Apple")); // false
		
		
		System.out.println("--------------");
		// size()
		// used to get the size of the list
		System.out.println(a1.size()); // 7
		
		
		System.out.println("--------------");
		// sort and reverseOrder()
		// used to sort the elements from a list
		ArrayList<Integer> res = new ArrayList<Integer>();
		res.add(50);
		res.add(20);
		res.add(10);
		res.add(40);
		res.add(30);
		System.out.println("Before Sorting: " + res); // Before Sorting: [50, 20, 10, 40, 30]
		// res.sort(null); // sorting in ascending order
		Collections.sort(res); // sorting in ascending order
		System.out.println("After Sorting in ascending order: " + res); // After Sorting: [10, 20, 30, 40, 50]
		Collections.sort(res, Collections.reverseOrder()); // sorting in descending order
		System.out.println("After Sorting in descending order: " + res); // After Sorting: [50, 40, 30, 20, 10]
		
		
		System.out.println("--------------");
		// subList()
		// used to create a new list from the original list
		// subList(start-Index, end-Index)
		System.out.println(res.subList(1, 4)); // [40, 30, 20]
		
		
		System.out.println("--------------");
		// reverse()
		// used to reverse the elements of the list
		System.out.println("Before Reversing: " + res); // Before Reversing: [50, 40, 30, 20, 10]
		System.out.println("After Reversing: " + res.reversed()); // After Reversing: [10, 20, 30, 40, 50]
		
		
		System.out.println("--------------");
		// remove()
		// used to remove an element at the specified index
		res.remove(0);
		System.out.println(res); // [40, 30, 20, 10]
		
		
		System.out.println("--------------");
		// min() and max()
		// used to get the minimum and maximum element from the list
		System.out.println(Collections.min(res)); // 10
		System.out.println(Collections.max(res)); // 40
		
		
		System.out.println("--------------");
		// equals()
		// used to compare two or more lists and returns boolean value
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(10);
		a3.add(20);
		a3.add(30);
		System.out.println(a3); // [10, 20, 30]
		
		ArrayList<Integer> a4 = new ArrayList<Integer>();
		a4.add(10);
		a4.add(20);
		a4.add(30);
		System.out.println(a4); // [10, 20, 30]
		
		System.out.println(a3.equals(a4)); // true
		System.out.println(a3.equals(res)); // false
		
		
		System.out.println("--------------");
		// clone()
		// used to copy the elements of one list to another list
		// two ways to clone a list
		// 1. shallow copy
		// 2. deep copy
		
		// 1. shallow copy
		// one list does not affect the other list
		ArrayList<Integer> a5 = new ArrayList<Integer>();
		a5.add(10);
		a5.add(20);
		a5.add(30);
		System.out.println(a5); // [10, 20, 30]
		
		ArrayList<Integer> a6 = (ArrayList<Integer>) a5.clone();
		System.out.println(a6); // [10, 20, 30]
		
		a5.set(0, 100);
		System.out.println(a5); // [100, 20, 30]
		System.out.println(a6); // [10, 20, 30]
		
		System.out.println("==============");
		// 2. deep copy
		// one list affects the other list
		ArrayList<Integer> a7 = new ArrayList<Integer>();
		a7.add(10);
		a7.add(20);
		a7.add(30);
		System.out.println(a7); // [10, 20, 30]
		
		ArrayList<Integer> a8 = a7;
		System.out.println(a8); // [10, 20, 30].
		
		a7.set(0, 99);
		System.out.println(a7); // [99, 20, 30]
		System.out.println(a8); // [99, 20, 30]
		
		
		System.out.println("--------------");
		// asList()
		// used to convert an array to a list
		String[] arr = {"Ramu", "Vishal", "Dhileep"};
		System.out.println(Arrays.toString(arr));
		
		List<String> res1 = Arrays.asList(arr);
		System.out.println(res1);
		
		
		System.out.println("--------------");
		// frequency()
		// used to count number of times the element repeats in the list
		ArrayList<Integer> arr3 = new ArrayList<Integer>();
		arr3.add(10);
		arr3.add(20);
		arr3.add(10);
		arr3.add(30);
		arr3.add(10);
		arr3.add(20);
		System.out.println(arr3); // [10, 20, 10, 30, 10, 20]
		System.out.println(Collections.frequency(arr3, 10)); // 3
		
		
		System.out.println("--------------");
		// clear()
		// used to remove all the elements from the list
		arr3.clear();
		System.out.println(arr3); // []
		
		
	}

}
