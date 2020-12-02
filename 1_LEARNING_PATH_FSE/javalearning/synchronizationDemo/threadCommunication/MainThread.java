package com.rohith.javalearning.synchronizationDemo.threadCommunication;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		t.start();
		synchronized(t) {
			System.out.println("Main threaad is waiting");
			try {
				t.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Main thread is notified");
			System.out.println(t.total);
		}

	}

}
