package com.multi_tasking;

//creating a pre-defined thread

public class Test extends Thread {
	
	public static void main(String[] args) {   //main thread / pre-defined thread
		 for(int i=0; i<=10; i++)
		 {
			 System.out.println(i);
		 }
	}
}
