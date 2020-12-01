package com.rohith.javalearning.serilizationdemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {

			fos = new FileOutputStream("/home/vazha/Downloads/emp.ser");
			oos = new ObjectOutputStream(fos);
			Employee emp = new Employee(1, "aaa", 10000, 1234);
			oos.writeObject(emp);
			System.out.println("Employee object serialised");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
