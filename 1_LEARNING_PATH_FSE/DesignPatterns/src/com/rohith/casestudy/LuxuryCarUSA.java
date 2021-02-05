package com.rohith.casestudy;

public class LuxuryCarUSA implements CarParser {

	@Override
	public String parse() {
		System.out.println("Luxury car in USA");
		return "Luxury car - USA";
	}

}
