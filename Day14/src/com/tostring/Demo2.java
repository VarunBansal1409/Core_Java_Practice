package com.tostring;

public class Demo2 {

	int bno;
	String bname;

	public Demo2(int bno, String bname) {
		this.bno = bno;
		this.bname = bname;
	}

	public static void main(String[] args) {
		//create a object Book class
		Demo2 b1 = new Demo2(101, "react");
		Demo2 b2 = new Demo2(102, "java");

		// create an array
		Demo2[] b = new Demo2[2];
        //array initialization
		b[0] = b1;
		b[1] = b2;

		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i].bno + " : ");
			System.out.println(b[i].bname);
		}

	}

}
