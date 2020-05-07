import java.util.Scanner;
public class Main{
    public static void main(String[] arg)
    {
        
        Associate obj=new Associate();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the associate id:");
        obj.setAssociateId(s.nextInt());
        s.nextLine();
        System.out.println("Enter the associate name:");
        obj.setAssociateName(s.nextLine());
        System.out.println("Enter the number of days:");
        obj.trackAssociateStatus(s.nextInt());
        System.out.println("The associate "+obj.getAssociateName()+" work status:"+ obj.getWorkStatus());
    }
    
}