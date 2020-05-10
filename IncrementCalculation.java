import java.util.Scanner;

public class IncrementCalculation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int salary;
		float rating;
		System.out.println("Enter the salary");
		salary=sc.nextInt();
		System.out.println("Enter the Performance appraisal rating");
		rating=sc.nextFloat();
		if(salary>0 && rating>=1 && rating<=5)
		{
			if(rating>=1 && rating<=3)
			{
				salary=salary+salary*10/100;
			}
			else if(rating>3 && rating <=4)
			{
				salary=salary+salary*25/100;
			}
			else
			{
				salary=salary+salary*30/100;
			}
			System.out.println(salary);
		}
		else
		{
			System.out.println("Invalid input");
		}
	}
}