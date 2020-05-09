import java.util.Scanner;

public class LuckyNum {
public static void main(String[] args) {
	System.out.print("Enter the car no:");
	int a,Sum=0;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	if(a>0 && String.valueOf(a).length()>3)
	{
			while(a>0)
			{
				int n=a%10;
				a=a/10;
				Sum=Sum+n;
			}
			if(Sum%3==0 | Sum%5==0 |Sum%7==0)
			{
				System.out.println("Lucky Number");
			}
			else
			{
				System.out.println("Sorry its not my lucky number");
			}
	}
	else
	{
		System.out.println(a+" is not a valid car number");
	}
}
}
