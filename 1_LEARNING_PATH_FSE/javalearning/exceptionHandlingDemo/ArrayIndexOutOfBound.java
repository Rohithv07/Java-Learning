package com.rohith.javalearning.exceptionHandlingDemo;

public class ArrayIndexOutOfBound {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6 };
		try {
			System.out.println(arr[7]); // array index out of bound exception
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter an index with in the range please");
		}
	}

	void method1() {
		System.out.println("Method 1");
	}
}
