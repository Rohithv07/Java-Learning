package com.rohith.abstractfactory;

/*
 * to avoid dependancy between the client and the factories,  we optionally implemented a factory-produccer which has a static method and is responsible to provied a desired factory object to the client object
 */
public final class ParserFactoryProducer {

	private ParserFactoryProducer() {
		throw new AssertionError();
	}

	public static AbstractFactory getFactory(String factoryType) {
		switch (factoryType) {
		case "NYFactory":
			return new NYParserFactory();
		case "TWFactory":
			return new TWParserFactory();
		}
		return null;
	}
}
