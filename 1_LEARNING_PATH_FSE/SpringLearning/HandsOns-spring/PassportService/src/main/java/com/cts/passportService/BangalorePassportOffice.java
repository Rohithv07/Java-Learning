package com.cts.passportService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Type your code here
@Component
public class BangalorePassportOffice  implements HeadPassportOffice{

	private Document bangaloreDocument;
		
    // Type your code here
	@Autowired
	public BangalorePassportOffice(Document bangaloreDocument) {
		super();
		this.bangaloreDocument = bangaloreDocument;
	}

	@Override
	public void doPhotoVerification() {
		System.out.println("Photo verification done using " + bangaloreDocument.getIdProof());
	}

	@Override
	public void issuePassport() {
		System.out.println("Passport issue is in progress for " + bangaloreDocument.getName() + " from " + bangaloreDocument.getCity() + " office");
	}

	
	// Type your code here

	

}
