package com.rohith.javalearning.synchronizationDemo.blocks;

public class DisplayMessage {
	public void sayHello(String name) {
		synchronized (this) { // others threads have to wait in entering this
								// block if
								// any others enters it.
			// to have class level lock, use synchronize(DisplayMessage m)
			// for our own object, synchronized(new String()) and no other
			// thread could access it.
			for (int i = 1; i <= 10; i++) {
				System.out.println(name);
				try {
					Thread.sleep(1000); // even though it sleeps, the order for
										// executing this function not changed
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
