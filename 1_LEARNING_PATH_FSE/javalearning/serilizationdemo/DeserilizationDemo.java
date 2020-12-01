package com.rohith.javalearning.serilizationdemo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserilizationDemo {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(("/home/vazha/Downloads/emp.ser"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		Employee emp = (Employee) obj;
		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(emp.salary);
		System.out.println(emp.ssn); // since transient it will show 0
		fis.close();
		ois.close();

	}

}
