package com.rohith.javalearning.interface2;

public class MyCircle implements Circle, Circle2 {

	@Override
	public void calculateArea() {
		System.out.println(Circle.pi); // we need to say Circle.pi to get value
										// otherwise error as there are 2 interfaces
										// with pi in it.
		System.out.println("Area is 100cm^2");
	}

	@Override
	public void calculateArea(float radius) {
		System.out.println("Area is 101cm^2");
	}

	public static void main(String[] args) {
		MyCircle circle = new MyCircle();
		circle.calculateArea();
		circle.calculateArea(10);
	}

}

// if the methods inside the Circle and Circle2 are with same number of
// parameters and return type, then there is no need to implement both
// but if they have different datatype, then it shows error
