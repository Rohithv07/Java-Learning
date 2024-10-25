package com.rohith.javalearning.synchronizationDemo.classLock;

public class DisplayMessage {
	public synchronized static void sayHello(String name) {
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
