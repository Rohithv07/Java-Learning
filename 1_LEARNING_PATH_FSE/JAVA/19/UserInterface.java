import java.util.*;
public class UserInterface {
    public static CommissionInfo generateCommissionObtained() {
        CommissionInfo commissionInfo = (ticket) -> {
            double commission = 0;
            if (ticket.getClassType().equalsIgnoreCase("SL") || ticket.getClassType().equalsIgnoreCase("2S"))
                commission = 60;
            else if (ticket.getClassType().equalsIgnoreCase("1A") || ticket.getClassType().equalsIgnoreCase("2A") || ticket.getClassType().equalsIgnoreCase("3A"))
                commission = 100;
            return commission;
        };
        
        return commissionInfo;
    }
    
   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of passengers");
        int passengerNo = sc.nextInt();
        Ticket [] ticket = new Ticket[passengerNo];
        for (int i=0; i<passengerNo; i++) {
            System.out.println("Details of Passenger " + (i+1) + ":");
            System.out.println("Enter the pnr no:");
            long pnrNo = sc.nextLong();
            System.out.println("Enter passenger name:");
            String passengerName = sc.next();
            System.out.println("Enter seat no:");
            int seatNo = sc.nextInt();
            System.out.println("Enter class type:");
            String classType = sc.next();
            System.out.println("Enter ticket fare:");
            double ticketFare = sc.nextDouble();
            ticket[i] = new Ticket(pnrNo, passengerName, seatNo, classType, ticketFare); 
        }
        CommissionInfo c = generateCommissionObtained();
        double commission = 0;
        for (Ticket t: ticket) 
            commission += c.calculateCommissionAmount(t);
        System.out.println("Commission Obtained");
        System.out.printf("Commission obtained per each person: Rs.%.2f", commission );
    }
    
}
