public class Main{
    
    public static void main(String args[]){
        Customer c=new Customer(123,"TOM","tomyoung@gmail.com");
        SavingsAccount sa=new SavingsAccount(123456789,c,15000.00,2000);
        sa.withdraw(1000);
    }
}