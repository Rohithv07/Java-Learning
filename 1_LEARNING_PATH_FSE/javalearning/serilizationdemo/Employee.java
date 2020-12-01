package com.rohith.javalearning.serilizationdemo;

import java.io.Serializable;

public class Employee implements Serializable {
	int id;
	String name;
	double salary;
	transient int ssn; // confidential data, so we give transient as it is not
						// required to be serialized

	Employee(int id, String name, double salary, int ssn) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.ssn = ssn;
	}

}
