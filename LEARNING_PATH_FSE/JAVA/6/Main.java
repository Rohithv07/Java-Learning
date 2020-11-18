import java.util.*;
public class Main {
    public static void main (String [] args) {
        Ticket t = new Ticket();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of bookings:");
        int noOfBooking = sc.nextInt();
        System.out.println("Enter the availableTickets:");
        Ticket.setAvailableTickets(sc.nextInt());
        while (noOfBooking-- > 0) {
            System.out.println("Enter the ticketid:");
            t.setTicketid(sc.nextInt());
            System.out.println("Enter the price:");
            t.setPrice(sc.nextInt());
            System.out.println("Enter the no of tickets:");
            int ticketCount = sc.nextInt();
            System.out.println("Available tickets:" + Ticket.getAvailableTickets());
            int total = t.calculateTicketCost(ticketCount);
            System.out.println("Total amount:" + total);
            System.out.println("Available ticket after booking:" + Ticket.getAvailableTickets());
            
        }
    }
}