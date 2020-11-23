public class Main{
    
    public static void main(String args[]){
        Customer customer = new Customer(1, "abc", "abc@mail.com");
        SavingsAccount savingsAccount = new SavingsAccount(1234, customer, 10000, 2000);
        savingsAccount.withdraw(5000);
        
    }
}
