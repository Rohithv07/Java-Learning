package com.ui;
import com.utility.*;
import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		//Fill the UI code
		Bazaar bazaar = new Bazaar();
		System.out.println("Enter the no of Policy names you want to store");
		int numberOfPolicyNames = Integer.parseInt(sc.nextLine());
		int policyId;
		String policyName;
		while (numberOfPolicyNames-- > 0) {
		    try {
    		    System.out.println("Enter the Policy ID");
    		    policyId = Integer.parseInt(sc.nextLine());
    		    System.out.println("Enter the Policy Name");
    		    policyName = sc.nextLine();
    		    bazaar.addPolicyDetails(policyId, policyName);
		    }catch(Exception e) {
		        System.out.println(e.toString());
		    }
		}
		Map<Integer, String> policyMap = bazaar.getPolicyMap();
		for (int key: policyMap.keySet()) {
		    System.out.println(key + " " + policyMap.get(key));
		}
		System.out.println("Enter the policy type to be searched");
		String policyType = sc.nextLine();
		List<Integer>result = bazaar.searchBasedOnPolicyType(policyType);
		for (int numbers: result)
		    System.out.println(numbers);

	}

}
