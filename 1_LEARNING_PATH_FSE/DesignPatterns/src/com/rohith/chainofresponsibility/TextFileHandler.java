package com.rohith.chainofresponsibility;

/*
 * ConcreteHandler to handle text file types.
 */
public class TextFileHandler implements Handler {

	private Handler handler;
	private String handlerName;

	public TextFileHandler(String handlerName) {
		this.handlerName = handlerName;
	}

	@Override
	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	@Override
	public void process(File file) {
		if (file.getFileType().equals("text")) {
			System.out.println("Processing and saving the text file.... by  " + handlerName);
		} else if (handler != null) {
			System.out.println(handlerName + " forwards request to " + handler.getHandlerName());
			handler.process(file);
		} else {
			System.out.println("File not supported");
		}
	}

	@Override
	public String getHandlerName() {
		return handlerName;
	}

}