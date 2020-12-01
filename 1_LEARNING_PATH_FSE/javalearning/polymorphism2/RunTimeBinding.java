package com.rohith.javalearning.polymorphism2;

public class RunTimeBinding {

	public static void main(String[] args) {
		AppleLaptop m1 = new MacBookPro();
		MacBook m2 = new NewMacbookPro();
		m1.start();
		m1.shutdown();
		((MacBook) m1).anotherMethod();
		MacBookPro m3 = (MacBookPro) m1; // object up casting
		m2.start();
		m2.shutdown();
		NewMacbookPro m4 = (NewMacbookPro) m2; // object down casting
	}

}
