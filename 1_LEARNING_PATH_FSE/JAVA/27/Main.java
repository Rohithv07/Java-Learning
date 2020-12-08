import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Flight flight = new Flight(1, "abc", "cde", 4, 100.00);
        FlightManagementSystem flightManagementSystem = new FlightManagementSystem();
        boolean result = flightManagementSystem.addFlight(flight);
        if(result)
            System.out.println("Flight details added successfully");
        else
            System.out.println("Addition not done");
        
    }
}
