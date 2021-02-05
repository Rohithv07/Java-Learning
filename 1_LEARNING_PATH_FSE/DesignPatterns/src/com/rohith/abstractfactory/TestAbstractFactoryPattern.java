package com.rohith.abstractfactory;

/*
 * This is the test class
 */
public class TestAbstractFactoryPattern {
	public static void main(String[] args) {
		AbstractFactory parserFactory = ParserFactoryProducer.getFactory("NYFactory");
		XMLParser parser = parserFactory.getParserInstance("NYORDER");
		String message = "";
		message = parser.parse();
		System.out.println(message);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		parserFactory = ParserFactoryProducer.getFactory("TWFactory");
		parser = parserFactory.getParserInstance("TWORDER");
		message = parser.parse();
		System.out.println(message);
	}
}
