package com.rohith.chainofresponsibility;


/*
 * Handler is an interface.
 */
public interface Handler {
	public void setHandler(Handler handler); // set the next handler in the chain.

	public void process(File file); // process the request only if the handler can.

	public String getHandlerName(); // return the handlers name.
}
