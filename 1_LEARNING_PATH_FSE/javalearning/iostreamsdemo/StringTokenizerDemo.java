package com.rohith.javalearning.iostreamsdemo;

import java.util.*;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		// break string to multiple tokens
		String s = "If in doubt, run your code";
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		// separate with comma
		StringTokenizer st1 = new StringTokenizer(s, ",");
		while (st1.hasMoreTokens()) {
			System.out.println("Separating with a delimiter comma");
			System.out.println("\n" + st1.nextToken());
		}
		// lets take the 3rd constructor in stringtokenizer
		StringTokenizer st2 = new StringTokenizer(s, ",", true); // here true or
																	// false
																	// decides
																	// whether
																	// we need
																	// to
																	// include
																	// the
																	// delimiter
																	// as token
																	// or not
		System.out.println("Checking the 3rd constructor");
		while (st2.hasMoreTokens()) {
			System.out.println("\n" + st2.nextToken());
		}

	}

}
