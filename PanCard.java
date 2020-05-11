import java.util.Scanner;
import java.util.regex.Pattern;


public class PanCard {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter the PAN no:");
		s=sc.nextLine();
		Pattern pattern=Pattern.compile("[A-Z0-9]*");
		java.util.regex.Matcher matcher=pattern.matcher(s);
		if(s.length()!=10)
		{
			System.out.println("Invalid PAN no");
			System.exit(1);
		}
		if(!matcher.matches() | validateS(s.substring(0, 5))==false
				|validateI(s.substring(5, 9))==false |validateS(s.substring(9, 10))==false)
		{
			System.out.println("Invalid PAN no");
		}
		else
		{
			System.out.println("Valid PAN no");
		}		
	}

	private static boolean validateI(String s) {
		// TODO Auto-generated method stub
		if(s.matches("^[0-9]*$"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	private static boolean validateS(String s) {
		// TODO Auto-generated method stub
		if(s.matches("[A-Z]+"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
