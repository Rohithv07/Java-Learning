package com.rohith.abstractfactory;

public class TWParserFactory implements AbstractFactory {

	@Override
	public XMLParser getParserInstance(String parserType) {
		switch (parserType) {
		case "TWERROR":
			return new TWErrorXMLParser();
		case "TWFEEDBACK":
			return new TWFeedbackXMLParser();
		case "TWORDER":
			return new TWOrderXMLParser();
		case "TWRESPONSE":
			return new TWResponseXMLParser();
		}
		return null;
	}

}

// returns client specific parser object.