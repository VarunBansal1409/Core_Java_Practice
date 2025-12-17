package com.list;

import java.util.ArrayList;
import java.util.List;

class Emp {
	int empno;
	String empname;
	double empsal;

	// constructor
	Emp(int empno, String empname, double empsal) {
		this.empno = empno;
		this.empname = empname;
		this.empsal = empsal;
	}

	// create a toString Representation
	public String toString() {
		return " empno: " + empno + " empname: " + empname + " empsal: " + empsal;
	}

}

public class Main1 {
	public static void main(String[] args) {

		// create a object for Emp class
		Emp e1 = new Emp(101, "abhi", 1000);
		Emp e2 = new Emp(102, "ramu", 2000);

		// create a list
		List<Emp> res = new ArrayList<>();

		// add elements into list
		res.add(e1);
		res.add(e2);

		System.out.println(res);
		
		//iterate using Enhanced forLoop()
		for( Emp res1 : res)
		{
			System.out.println(res1); 
		}

	}
}

// note: here we are storing the custom objects into the list using generics.
	// we are overriding the toString() method to get the proper representation of the object.
