import java.util.*;
import java.text.*;
public class IncrementCalculation {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        double salary = sc.nextDouble();
        System.out.println("Enter the Performance appraisal rating");
        float rating = sc.nextFloat();
        if (salary <= 0 || rating < 1 || rating > 5) {
            System.out.println("Invalid Input");
            return;
        }
        double increment = 0;
        if (rating > 1 && rating <= 3) {
            increment = salary * 0.1;
        }
        else if (rating > 3.1 && rating <= 4) {
            increment = salary * 0.25;
        }
        else if (rating > 4.1 && rating <= 5) {
            increment = salary * 0.3;
        }
        DecimalFormat ft = new DecimalFormat("####"); 
        System.out.println(ft.format(salary + increment)); 
    }
}
