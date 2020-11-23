package com.rohith.javalearning.polymorphism;

public class Reviw {
	private String reviewText;
	private boolean approved;

	public Reviw(String reviewText) {
		this.reviewText = reviewText;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}
}
