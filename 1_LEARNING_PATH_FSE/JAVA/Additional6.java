import java.util.*;
public class Division {
    
    public String divideTwoNumbers(int number1, int number2) {
        StringBuilder sb = new StringBuilder();
        try {
            int result = number1 / number2;
            sb.append("The answer is " + result);
        } catch (ArithmeticException e) {
            sb.append("Division by zero is not possible");
        } finally {
            sb.append(". Thanks for using the application.");
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Division division = new Division();
        System.out.println("Enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(division.divideTwoNumbers(a, b));
    }
}
