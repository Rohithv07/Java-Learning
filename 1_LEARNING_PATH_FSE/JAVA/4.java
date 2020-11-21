import java.util.*;

public class Authority {
    public static boolean checkValidity(String s) {
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch) || ch == ' ')
                continue;
            else
                return false;
        }
        return true;
    }
    public static String processConcatenation(String s1, String s2) {
        return s1.concat(s2);
    }
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inmate's name:");
        String studentName = sc.nextLine();
        System.out.println("Inmate's father's name:");
        String fatherName = sc.nextLine();
        if (!checkValidity(studentName) || !checkValidity(fatherName)) {
            System.out.println("Invalid name");
            return;
        }
        String upperCaseStudentName = studentName.toUpperCase() + " ";
        String upperCaseFatherName = fatherName.toUpperCase();
        String concatenated = processConcatenation(upperCaseStudentName, upperCaseFatherName);
        System.out.println(concatenated);
    }
}
