package com.spring.app;

public class AddressBook {
    
    private String phoneNumber;
    private Address tempAddress;
    
    AddressBook(String phoneNumber, Address tempAddress) {
        this.phoneNumber = phoneNumber;
        this.tempAddress = tempAddress;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setTempAddress(Address tempAddress) {
        this.tempAddress = tempAddress;
    }
    
    public Address getTempAddress() {
        return tempAddress;
    }
	



}
