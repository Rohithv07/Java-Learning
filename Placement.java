import java.util.Scanner;

public class Placement {
	public static void main(String[] args) {
		int arr[]=new int[3];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of students placed in CSE:");
		arr[0]=sc.nextInt();
		//System.out.println(arr[0]);
		System.out.print("Enter the no of students placed in ECE:");
		arr[1]=sc.nextInt();
		//System.out.println(arr[1]);
		System.out.print("Enter the no of students placed in MECH:");
		arr[2]=sc.nextInt();
		//System.out.println(arr[2]);
		int max=arr[0];
		if(arr[0]<0 | arr[1]<0 | arr[2]<0)
		{
			System.out.println("Input is invalid");
			System.exit(1);
		}
		for(int i=1;i<3;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		if(arr[0]==arr[1])
		{
		    if(arr[0]==arr[2])
		    {
		        System.out.println("None of the department has got the highest placement");
			    System.exit(1);
		    }
		}
		System.out.println("Highest placement");
		for(int i=0;i<3;i++)
		{
			if(arr[i]==max)
			{
				if(i==0)
				{
					System.out.println("CSE");
				}
				if(i==1)	
				{
					System.out.println("ECE");
				}
				if(i==2)
				{
					System.out.println("MECH");
				}
			}
		}
	}
}
