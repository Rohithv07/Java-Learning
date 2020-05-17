import java.util.*;
public class Division{
    public String divideTwoNumbers(int number1,int number2){
        String S="";
        try{
            int result=number1/number2;
            S="The answer is "+result+".";
        }
        catch(ArithmeticException e){
            S="Division by zero is not possible.";
        }
        finally{
            S+="Thanks for using the application.";
            return S;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        System.out.println(new Division().divideTwoNumbers(number1,number2));
    }
}