package com.rohith.abstractfactory;

public class NYParserFactory implements AbstractFactory {

	@Override
	public XMLParser getParserInstance(String parserType) {
		switch (parserType) {
		case "NYERROR":
			return new NYErrorXMLParser();
		case "NYFEEDBACK":
			return new NYFeedbackXMLParser();
		case "NYORDER":
			return new NYOrderXMLParser();
		case "NYRESPONSE":
			return new NYResponseXMLParser();
		}
		return null;
	}

}

// returns client specific parser object
