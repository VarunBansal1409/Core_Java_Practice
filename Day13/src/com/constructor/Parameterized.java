package com.constructor;

public class Parameterized {
	
	Parameterized(int a, int b) {
		
		System.out.println(a * b);
	}
	
	int eno;
	String ename;
	
	Parameterized(int eno1 , String ename1){
		
		this.eno = eno1;
		this.ename = ename1;
		
	}

	public static void main(String[] args) {
		
		Parameterized p1 = new Parameterized(108, 1);
		
		System.out.println("______________________");
		System.out.println();
		
		Parameterized p2 = new Parameterized(101 , "Sumit");
		System.out.println(p2.eno);
		System.out.println(p2.ename);
		
	}
}
