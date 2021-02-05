package com.rohith.casestudy;

public class MicroCarUSA implements CarParser {

	@Override
	public String parse() {
		System.out.println("Micro car in USA");
		return "Micro car - USA";
	}

}
