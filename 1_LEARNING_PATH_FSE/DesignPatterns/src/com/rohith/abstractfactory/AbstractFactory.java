package com.rohith.abstractfactory;

/*
 * This interface will be implemented by all the concrete factories.
 */
public interface AbstractFactory {
	public XMLParser getParserInstance(String parserType);
}
