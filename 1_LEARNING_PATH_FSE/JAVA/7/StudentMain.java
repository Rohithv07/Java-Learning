import java.util.*;

public class StudentMain {
    public static void main (String [] args) {
        Student st;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student's Id:");
        int id = sc.nextInt();
        System.out.println("Enter Student's Name");
        String sName = sc.nextLine();
        System.out.println("Enter Student's address:");
        String sAddress = sc.nextLine();
        System.out.println("Whether the student is from NIT(Yes/No)");
        String choice = " ";
        while(choice=="YES" || choice=="yes" || choice=="NO" || choice=="no"){
            System.out.println("Whether the student is from NIT(Yes/No):");
            choice=sc.next();
            if(!(choice=="YES" || choice=="yes" || choice=="NO" || choice=="no"))
                System.out.println("Wrong Input");
        }
        if (choice == "YES" || choice == "yes") {
            st = new Student(id, sName, sAddress);
        }
        else {
            System.out.println("Enter the college name:");
            String college = sc.nextLine();
            st = new Student(id, sName, sAddress, college);
        }
        System.out.println("Student id:"+st.getStudentId());
        System.out.println("Student name:"+st.getStudentName());
        System.out.println("Address:"+st.getStudentAddress());
        System.out.println("College name:"+st.getCollegeName());
    }
}