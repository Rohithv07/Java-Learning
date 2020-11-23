package com.rohith.javalearning.polymorphism;

public class Staff extends User {
	public int id = 2;

	public void printId() {
		System.out.println("id: " + id);
		System.out.println("super.id" + super.id);
	}

	public Staff() {
		userType = "Staff";
	}

	public void printUserType() {
		System.out.println("Staff");
	}

	public Reviw postAReview(String reviewText) { // cannot be private as the
													// method cannot be less
													// accessible
		System.out.println("Staff Post a review");
		Reviw review = super.postAReview(reviewText);
		review.setApproved(true);
		return review;
	}

	public void instanceMethod(int d) {
		System.out.println("Staff: instanceMethod");
	}

	public void instanceMethod(Staff d) {
		System.out.println("Staff: instanceMethod");
	}

	// public void finalMethod() {} // final method cannot be overridden
	public static void staticMethod() {
		System.out.println("Staff: static method");
	}
}

// super keyword cannot be used inside a static context
// can be used to invoke hidden field.
