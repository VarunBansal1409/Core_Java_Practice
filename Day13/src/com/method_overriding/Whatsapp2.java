package com.method_overriding;

public class Whatsapp2 extends Whatsapp1 {
	@Override
	void message() {
		super.message();
		System.out.println("Double Tick Checked");
	}

	void call() {
		System.out.println("Voice call");
	}
}
