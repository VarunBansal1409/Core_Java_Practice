package com.set;

import java.util.HashSet;
import java.util.Set;

class Emp{
	
	int eid;
	String ename;
	double esal;
	
	Emp(int eid, String ename, double esal) {
		
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		
	}
	
	public String toString() {
		return "empno:" + eid + "  empname:" + ename + "  empsal:" + esal;
	}
	
}

public class Main1 {

	public static void main(String[] args) {
		
		Emp e1 = new Emp(1, "Ramu", 2000.0);
		Emp e2 = new Emp(2, "Dhileep", 5000.0);
		
		Set<Emp> s1 = new HashSet<Emp>();
		
		s1.add(e1);
		s1.add(e2);
		
		for(Emp res : s1) {
			System.out.println(res);
		}
	}
	
}
