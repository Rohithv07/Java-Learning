import java.util.Scanner;
public class SnacksDetails
{
    public static void main(String[] args)
    {
        int n1,n2,n3;
        int pizza=100,puffs=20,cooldrink=10;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of pizzas bought:");
        n1=sc.nextInt();
        System.out.println("Enter the no of puffs bought:");
        n2=sc.nextInt();
        System.out.println("Enter the no of cool drinks bought:");
        n3=sc.nextInt();
        System.out.println("Bill Details");
        System.out.println("No of pizzas:"+n1);
		System.out.println("No of puffs:"+n2);
		System.out.println("No of cooldrinks:"+n3);
		System.out.print("Total price=");
		System.out.println(n1*pizza+n2*puffs+n3*cooldrink);
		System.out.println("ENJOY THE SHOW!!!");
    }
}