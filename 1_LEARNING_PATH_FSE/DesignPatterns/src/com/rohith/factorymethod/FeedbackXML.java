package com.rohith.factorymethod;

/*
 * this class parse the feedback message xmls.
 */
public class FeedbackXML implements XMLParser {

	@Override
	public String parse() {
		System.out.println("Parsing feedback XML........");
		return "Feedback XML message";
	}

}
