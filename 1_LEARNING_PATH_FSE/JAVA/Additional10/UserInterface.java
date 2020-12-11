import java.util.*;

public class UserInterface{
    //private static int fees = 0;
    public static TuitionFee generateFeeReceipt() {
        return (String courseType, int basicFee, int noOfSemesters) -> {
            int fee = basicFee * noOfSemesters;
            if (courseType.equalsIgnoreCase("regular"))
                return fee;
            else if (courseType.equalsIgnoreCase("selfFinance"))
                return fee + 50000;
            return 0;
        };
    }
    public static void main(String [] args) {
        
    // Fill the code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter registration number");
        long regNo = sc.nextLong();
        System.out.println("Enter student name");
        String name = sc.next();
        System.out.println("Enter no of semesters");
        int sem = sc.nextInt();
        System.out.println("Enter basic fee");
        int basicFee = sc.nextInt();
        System.out.println("Course type");
        String type = sc.next();
        int tuitionFee = generateFeeReceipt().calculateTuitionFees(type, basicFee, sem);
        System.out.println("Fees Receipt");
        System.out.println("Registration number: " + regNo);
        System.out.println("Student name: " + name);
        System.out.println("Tuition fee for " + type + " student: " + tuitionFee);
    
    }
    
}
