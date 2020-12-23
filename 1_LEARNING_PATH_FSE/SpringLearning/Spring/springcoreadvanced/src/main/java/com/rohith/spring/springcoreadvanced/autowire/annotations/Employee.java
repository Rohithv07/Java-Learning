package com.rohith.spring.springcoreadvanced.autowire.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	
	private Address address;

	Employee(Address address) {
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}

	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}

// we can also give @Autowired at field level ie above private Address address.
// it can also be used at the constructor level ie above the constructor.
//@Qualifier("name") injects based on the name matching with "name".
