import java.util.Scanner;

public class Numerology {
public static void main(String[] args) {
	char[][] arr=new char[26][26];
	int i=0;
	for(char c='A';c<='Z';c++)
	{
		arr[0][i]=c;
		i++;
	}
		arr[1][0]='1';
		arr[1][1]='2';
		arr[1][2]='3';
		arr[1][3]='4';
		arr[1][4]='5';
		arr[1][5]='8';
		arr[1][6]='3';
		arr[1][7]='5';
		arr[1][8]='1';
		arr[1][9]='1';
		arr[1][10]='2';
		arr[1][11]='3';
		arr[1][12]='4';
		arr[1][13]='5';
		arr[1][14]='7';
		arr[1][15]='8';
		arr[1][16]='1';
		arr[1][17]='2';
		arr[1][18]='3';
		arr[1][19]='4';
		arr[1][20]='6';
		arr[1][21]='6';
		arr[1][22]='6';
		arr[1][23]='5';
		arr[1][24]='1';
		arr[1][25]='7';
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter your name:");
	    String s=sc.nextLine();
	    if(s.matches("[A-Z]+") && !s.matches(" "))
	    {
	    	int num=numerology(s,arr);
	    	System.out.println("Your numerology no is:"+num);
	    }
	    else
	    {
	    	System.out.println("Invalid name");
	    }
}

private static int numerology(String s, char[][] arr) {
	// TODO Auto-generated method stub
	int sum=0;
	for(int i=0;i<s.length();i++)
	{
		int asciivalue=(int)s.charAt(i);
		int position=asciivalue-65;
		sum=sum+Integer.parseInt(String.valueOf(arr[1][position]));
	}
	return sum;
}
	
}
