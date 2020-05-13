import java.util.*;
class UserMain{
    public static void main(String [] args){
        String customerId;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your ID");
        customerId=sc.nextLine();
        if(customerId.matches("[GBL]{3}/[0-9]{3}/[0-9]{4}"))
            System.out.println("Login success");
        else    
            System.out.println("Incorrect ID");
    }
}