import java.util.*;
public class Placement {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int cseMark;
        int eceMark;
        int mechMark;
        System.out.println("Enter the no of students placed in CSE:");
        cseMark = sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        eceMark = sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        mechMark = sc.nextInt();
        // input invalid condition
        if (cseMark < 0 || eceMark < 0 || mechMark < 0) {
            System.out.println("Input is Invalid");
            System.exit(0);
        }
        // equal mark for all 3 dept
        int maximum = Math.max(cseMark, Math.max(eceMark, mechMark));
        if ((maximum == cseMark) && (maximum == eceMark) && (maximum == mechMark))
            System.out.println("None of the department has got the highest placement");
        // now find the maximum if there exists for 2 departments
        else if ((maximum == cseMark) && (maximum == eceMark)) { 
            System.out.println("Highest placement");
            System.out.println("CSE");
            System.out.println("ECE");
        }
        else if ((maximum == cseMark) && (maximum == mechMark)) {
            System.out.println("Highest placement");
            System.out.println("CSE");
            System.out.println("MECH");
        }
        else if ((maximum == eceMark && maximum == mechMark)) {
            System.out.println("Highest placement");
            System.out.println("ECE");
            System.out.println("MECH");
        }
        else if (maximum == cseMark) {
            System.out.println("Highest placement");
            System.out.println("CSE");
        }
        else if (maximum == eceMark) {
            System.out.println("Highest placement");
            System.out.println("ECE");
        }
        else if (maximum == mechMark) {
            System.out.println("Highest placement");
            System.out.println("MECH");
        }
    }
}