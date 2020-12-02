import java.util.*;
import java.io.*;
public class Test {
    
    public static float calculateAverage(int [] age) {
        int length = age.length;
        float sum = 0;
        for (int elements: age)
            sum += elements;
        return  sum / length;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no.of employees:");
        int noOfEmployees = sc.nextInt();
        if (noOfEmployees < 2) {
            System.out.println("Please enter a valid employee count");
            return;
        }
        int [] age = new int [noOfEmployees];
        System.out.println("Enter the age for " + noOfEmployees + " employees:");
        for (int i=0; i<noOfEmployees; i++) {
            age[i] = sc.nextInt();
            if (age[i] < 28 || age[i] > 40) {
                System.out.println("Invalid age encountered!");
                return;
            }
        }
        float average = calculateAverage(age);
        System.out.printf("The average age is %.2f", average);
    }
}
