package com.ui;
import com.utility.*;
import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		//Fill the UI code
		System.out.println("Enter the no of Policy names you want to store");
		int num,policyId;
		String policyName,policyType;
		num=Integer.parseInt(sc.nextLine());
		Bazaar b=new Bazaar();
		for(int i=0;i<num;i++){
		    try{
		        System.out.println("Enter the Policy ID");
		        policyId=Integer.parseInt(sc.nextLine());
		        System.out.println("Enter the Policy Name");
		        policyName=sc.nextLine();
		        b.addPolicyDetails(policyId,policyName);
		    } catch(Exception e){
		        System.out.println(e.toString());
		    }
		    }
		Map<Integer,String> policyMap=b.getPolicyMap();
		policyMap.forEach((id,name)->
		    System.out.println(id+" "+name)
		);
		System.out.println("Enter the policy type to be searched");
        policyType=sc.next();
        List<Integer> list=b.searchBasedOnPolicyType(policyType);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
	}

}
