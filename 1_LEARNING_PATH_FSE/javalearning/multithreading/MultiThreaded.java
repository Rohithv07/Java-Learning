package com.rohith.javalearning.multithreading;

// 2 methods mainly
//1. extend a thread class
// 2. use runnable interface
public class MultiThreaded extends Thread {

	public static void main(String[] args) throws InterruptedException {
		MultiThreaded mt = new MultiThreaded();
		mt.setPriority(MAX_PRIORITY);
		mt.setName("mt");
		mt.start(); // here at first some j's are printed then i's then again
					// j's
		MultiThreaded mt1 = new MultiThreaded();
		mt1.setPriority(MIN_PRIORITY);
		mt1.setName("mt1");
		mt1.start();
		// Thread currentThread = Thread.currentThread();// currentThread is
		// used
		// to retrieve the
		// current thread
		// System.out.println(currentThread.getName());
		// System.out.println("Thread name:" + currentThread.getName());
		/*
		 * for (int j = 1; j <= 200; j++) { System.out.print("j " + j + "\t");
		 * Thread.sleep(1000); }
		 */
	}

	public void run() {
		System.out.println("Thread name: " + Thread.currentThread().getName());
		/*
		 * Thread currentThread = Thread.currentThread(); // currentThread is
		 * used // to retrieve the // current thread currentThread.setName(
		 * "Name changed"); System.out.println(currentThread.getName()); /* /*
		 * for (int i = 1; i <= 200; i++) { System.out.print("i " + i + "\t");
		 * try { Thread.sleep(1000); } catch (InterruptedException e) {
		 * System.out.println("Child thread exiting"); } }
		 */

	}

}
