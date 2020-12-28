package com.spring.ui;
import com.spring.app.AddressBook;
import com.spring.app.Address;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static AddressBook loadAddressBook() {
	    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    AddressBook addressBook = (AddressBook)context.getBean("addBook");
	    return addressBook;
	    
	}
	
	public static void main(String[] args) {
        AddressBook addressBook = loadAddressBook();
        Address address = new Address();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temporary address");
        System.out.println("Enter the house name");
        address.setHouseName(sc.nextLine());
        System.out.println("Enter the street");
        address.setStreet(sc.nextLine());
        System.out.println("Enter the ciy");
        address.setCity(sc.nextLine());
        System.out.println("Enter the state");
        address.setState(sc.nextLine());
        System.out.println("Enter the phone number");
        addressBook.setPhoneNumber(sc.nextLine());
        
        System.out.println("Temporary address");
        System.out.println("House name:" + address.getHouseName());
        System.out.println("Street:" + address.getStreet());
        System.out.println("City:" + address.getCity());
        System.out.println("State:" + address.getState());
        System.out.println("Phone number :" + addressBook.getPhoneNumber());
	}

}
