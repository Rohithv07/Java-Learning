package com.rohith.factorymethod;

/*
 * This class tests the factory methods.
 */
public class TestFactoryMethods {
	public static void main(String[] args) {
		DisplayService service = new FeedbackXMLDisplayService();
		service.display();
		service = new ErrorXMLDisplayService();
		service.display();
		service = new OrderXMLDisplayService();
		service.display();
		service = new ResponseXMLDisplayService();
		service.display();
	}
}

/*
 * Letting the subclasses to implement the factory method creates the different
 * instances of parsers which can be used at runtime according to the need.
 */
