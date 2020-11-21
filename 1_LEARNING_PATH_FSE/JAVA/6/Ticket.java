public class Ticket {
    private int ticketid;
    private int price;
    private static int availableTickets;
    //getter for ticketid
    public int getTicketid() {
        return ticketid;
    }
    //setter for ticketid
    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }
    // getter for price
    public int getPrice() {
        return price;
    }
    // setter for pricre
    public void setPrice(int price) {
        this.price = price;
    }
    // getter and setter for availableTickets
    public static int getAvailableTickets() {
        return availableTickets;
    }
    public static void setAvailableTickets(int availableTickets) {
        if (availableTickets > 0)
            Ticket.availableTickets = availableTickets;
    }
    // method to calculateTicketCost
    public int calculateTicketCost(int nooftickets) {
        int totalAmount = -1;
        if (Ticket.availableTickets - nooftickets >= 0) {
            availableTickets -= nooftickets;
            totalAmount  = nooftickets * price;
        }
        return totalAmount;
    }
}