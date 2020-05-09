import java.util.Scanner;

public class Season {
public static void main(String[] args) {
	System.out.print("Enter the month:");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	if(a>=3 && a<=5)
	{
		System.out.println("Season:Spring");
	}
	else if(a>=6 && a<=8)
	{
		System.out.println("Season:Summer");
	}
	else if(a>=9 && a<=11)
	{
		System.out.println("Season:Autumn");
	}
	else if(a==12 | a==1 |a==2)
	{
		System.out.println("Season:Winter");
	}
	else
	{
		System.out.println("Invalid month");
	}
}
}