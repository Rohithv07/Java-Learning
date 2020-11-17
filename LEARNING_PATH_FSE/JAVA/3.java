import java.util.*;
public class AsciValue {
    public static char findAscii(int number) {
        return (char)number;
    } 
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits:");
        int number1 = sc.nextInt();
        // we can make use of a function to find the ascii character
        char ascii1 = findAscii(number1);
        int number2 = sc.nextInt();
        char ascii2 = findAscii(number2);
        int number3 = sc.nextInt();
        char ascii3 = findAscii(number3);
        int number4 = sc.nextInt();
        char ascii4 = findAscii(number4);
        System.out.println(number1 + "-" + ascii1);
        System.out.println(number2 + "-" + ascii2);
        System.out.println(number3 + "-" + ascii3);
        System.out.println(number4 + "-" + ascii4);
        
        // here we can also store the numbers inside the aray and there will be no chamge in the space complexity
        // but this is also fine
    }
}