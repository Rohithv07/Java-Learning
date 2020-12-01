package com.rohith.javalearning.polymorphism2;

public class AutomaticPromotion {
	public void print(int i) {
		System.out.println(i + " integer verison");
	}

	public void print(float i) {
		System.out.println(i + " float version");
	}

	public void print(String s) {
		System.out.println("string version");
	}

	public void print(Object s) {
		System.out.println("object version");
	}

	public static void main(String[] args) {
		AutomaticPromotion ap = new AutomaticPromotion();
		ap.print(10);
		ap.print(10.5f);
		ap.print("hello");
	}

}
// if we deletes the integer version method, then there will be a automatic
// promotion
// it will use the float version.
