import java.util.*;
public class Main{
    public static void main(String [] args){
        int n;
        Scanner sc=new Scanner(System.in);
        Ticket t=new Ticket();
        System.out.println("Enter no of bookings:");
        n=sc.nextInt();
        System.out.println("Enter the available tickets:");
        Ticket.setAvailableTickets(sc.nextInt());
        for(int i=0;i<n;i++){
            System.out.println("Enter the ticketid:");
            t.setTicketid(sc.nextInt());
            System.out.println("Enter the price:");
            t.setPrice(sc.nextInt());
            System.out.println("Enter the no of tickets:");
            int count=sc.nextInt();
            System.out.println("Available tickets: "+Ticket.getAvailableTickets());
            System.out.println("Total amount: "+t.calculateTicketCost(count));
            System.out.println("Available ticket for booking: "+Ticket.getAvailableTickets());
        }
    }
}