import java.util.*;

public class AccountDetails {
    public Scanner sc = new Scanner(System.in);
    
    public Account getAccountDetails() {
        Account account = null;
        int balance = 0;
        System.out.println("Enter account id:");
        int id = sc.nextInt();
        System.out.println("Enter account type:");
        String type = sc.next();
        while(balance <= 0) {
            System.out.println("Balance should be positive");
            System.out.println("Enter balance:");
            balance = sc.nextInt();
        }
        account = new Account(id, type, balance);
        return account;
    }
    
    public int getWithdrawAmount() {
        Account account = new Account();
        System.out.println("Enter amount to be withdrawn:");
        int withdrawAmount = sc.nextInt();
        if(withdrawAmount <= 0) {
            do {
                System.out.println("\nAmount should be positive");
                System.out.println("\nEnter amount to be withdrawn:");
                withdrawAmount = sc.nextInt();
                
            } while(withdrawAmount <= 0);
            account.withdraw(withdrawAmount);
        }
        return withdrawAmount;
    }

    public static void main (String[] args) {
        
        AccountDetails ac = new AccountDetails();
        ac.getAccountDetails();
    }
}
