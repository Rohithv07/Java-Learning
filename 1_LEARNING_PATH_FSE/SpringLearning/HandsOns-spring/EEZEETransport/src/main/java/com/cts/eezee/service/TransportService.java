package com.cts.eezee.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import com.cts.eezee.model.Booking;
import com.cts.eezee.model.Vehicle;

public class TransportService {
	private Vehicle vehicle;
	
	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void registerBooking(Booking booking) throws ParseException {
		
		
		// code here
		Scanner s = new Scanner(System.in).useDelimiter("\n");
		
		System.out.println("Enter the Customer Name");
		booking.setCustomerName(s.next());
		
		System.out.println("Enter the Mobile Number");
		booking.setMobileNumber(s.nextLong());
		
		System.out.println("Enter the Destination");
		booking.setDestination(s.next());
		
		System.out.println("Enter the Date of Jouney <dd-MM-yyy>");
		String date = s.next();
		SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy");
		Date doj=formatter.parse(date);
		booking.setDateOfJourney(doj);
		
		calculateTravelCost(vehicle.getSource(),booking.getDestination(),booking.getDateOfJourney());
		
	}
	public void calculateTravelCost(String source, String destination, Date doj) {

		// code here
		
		if(! checkAvailableDateForTravel(doj) ){
		    System.out.println("Invalid Travel Date");
		    System.exit(0);
		}
	
	    System.out.println("Total Travel Cost is Rs. "+ getCost(destination));
	}
	
	public boolean checkAvailableDateForTravel(Date doj){
		
		
		// code here
		try{
		    String currentDate = "27-04-2020";
    		Date curr = new SimpleDateFormat("dd-MM-yyyy").parse(currentDate);
    		
    		long diff = doj.getTime() - curr.getTime();
            int diffDays = (int) (diff / (24 * 60 * 60 * 1000));
    		
    		if(diffDays >= 0){
    		    return true;
    		}else{
    		    return false;
    		}
		} catch(ParseException e){
		    e.printStackTrace();
		}
		
		return false;
	}
	
	public double getCost(String destination) {
		
		// code here
		for( Map.Entry<String,Double> e : vehicle.getDestinationMap().entrySet()){
	        if(e.getKey().equalsIgnoreCase(destination)){
	            return e.getValue();
	        }
	    }
		return 0.0;
	}


}