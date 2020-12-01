package com.rohith.javalearning.polymorphism2;

public class CompileTimeBinding {

	void add(int a, int b) {
		int result = a + b;
		System.out.println(result);
	}

	void add(float a, float b) {
		float result = a + b;
		System.out.println(result);
	}

	void add(float a, float b, float c) {
		float result = a + b + c;
		System.out.println(result);
	}

	public static void main(String[] args) {
		CompileTimeBinding obj = new CompileTimeBinding();
		obj.add(4,  6);
		obj.add(3f, 4f);
		obj.add(2f, 3f, 4f);
	}

}
