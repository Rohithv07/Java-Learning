import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1,s2;
		while(sc.hasNext())
		{
			s1=sc.nextLine();
			if(Integer.parseInt(s1)<0)
			{
				System.out.println("Invalid Input");
				System.exit(1);
			}
			check(s1);
			
		}
		while(sc.hasNext())
		{
			s2=sc.nextLine();
			if(Integer.parseInt(s2)<0)
			{
				System.out.println("Invalid Input");
				System.exit(1);
			}
			check(s2);
		}
		
	}

	private static void check(String s) {
		String reverse="";
		// TODO Auto-generated method stub
		for(int i = s. length() - 1; i >= 0; i--)
		{
			reverse = reverse + s. charAt(i);
		}
		if(s.equals(reverse))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
}
