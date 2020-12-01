package com.rohith.javalearning.abstractdemo2;

public class Test {
	public static void main(String[] args) {
		// BMW bmw = new BMW(); //shows error as its abstract and cannot
		// instantiate
		ThreeSeries three = new ThreeSeries();
		three.accelerate();
		three.commonFunction();
		FiveSeries five = new FiveSeries();
		five.accelerate();
		five.commonFunction();
	}
}

// some points
/*
 * a class cannot be both abstract and final. a method cannot be both abstract
 * and static. cannot mark abstract method as static if we make any child class
 * as final, then we must make sure that child class must override all the
 * abstract methods in abstract class.
 */