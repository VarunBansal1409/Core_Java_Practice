package com.method_overriding;

public class Whatsapp3 extends Whatsapp2 {
	void message() {
		super.message();
		System.out.println("Blue Tick Checked");
	}

	void call() {
		super.call();
		System.out.println("Video Call");
	}

	void payment() {
		System.out.println("Payment System Achieved");
	}
}
