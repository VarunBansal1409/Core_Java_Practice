
package com.abstraction;

abstract class RealMe {
	// concrete method
	void youtube() {
		System.out.println("watching youtube");
	}

	// abstract method
	abstract void sendMsg();
}

class Airtel extends RealMe {
	
	@Override
	void sendMsg() {
		System.out.println("msg sent using Airtel sim");
	}
}

class Jio extends RealMe {

	@Override
	void sendMsg() {
		System.out.println("msg sent using Jio sim");
	}
}

public class Test1 {

	public static void main(String[] args) {

		RealMe m1 = new Airtel(); // up-casting
		m1.youtube();
		m1.sendMsg();

		System.out.println("=========");

		m1 = new Jio(); // up-casting
		m1.youtube();
		m1.sendMsg();
	}

}
