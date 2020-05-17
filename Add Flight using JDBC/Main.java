import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Flight flight =new Flight(10,"Kochi","Trivandrum",60,800.00);
        FlightManagementSystem fms=new FlightManagementSystem();
        if(fms.addFlight(flight)){
            System.out.println("Flight details added  successfully");
        
        }else {
            System.out.println("Addition not done");
        }
        
    }
}