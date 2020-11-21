package com.rohith.javalearning.inheritance2;

import com.rohith.javalearning.inhertance.A1;

public class B2 {
	public static void main(String [] args) {
		System.out.println("A1.publicMember: " + A1.publicMember);
		System.out.println("C2.publicMember: " + C2.publicMember);
		// cannot acces the protected members from A1 and C2
		//System.out.println("A1.protectedMember: " + A1.protectedMember); // shows error
		// System.out.println("C2.protectedMember: " + C2.protectedMember); // shows error
		// this is because B2 is not a family member of A1
	}
}
