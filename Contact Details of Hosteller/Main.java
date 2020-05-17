import java.util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main (String[] args) {
        Hosteller student = getHostellerDetails();
        System.out.println("Modify Room Number(Y/N)");
        char choice = sc.next().charAt(0);
        if(choice == 'Y') {
            System.out.println("New Room Number");
            student.setRoomNumber(Integer.parseInt(sc.nextLine()));
        }
        System.out.println("Modify Phone Number(Y/N)");
        choice = sc.next().charAt(0);
        if(choice == 'Y') {
            System.out.println("New Phone Number");
            student.setPhone(sc.nextLine());
        }
        System.out.println("The Student Details");
        System.out.print(student.getStudentId() + " ");
        System.out.print(student.getName() + " ");
        System.out.print(student.getDepartmentId() + " ");
        System.out.print(student.getGender() + " ");
        System.out.print(student.getPhone() + " ");
        System.out.print(student.getHostelName() + " ");
        System.out.print(student.getRoomNumber());
    }
    
    public static Hosteller getHostellerDetails() {
        Hosteller student = new Hosteller();
        System.out.println("Enter the Details:");
        System.out.println("Student Id");
        student.setStudentId(Integer.parseInt(sc.nextLine()));
        System.out.println("Student Name");
        student.setName(sc.nextLine());
        System.out.println("Department Id");
        student.setDepartmentId(Integer.parseInt(sc.nextLine()));
        System.out.println("Gender");
        student.setGender(sc.nextLine());
        System.out.println("Phone Number");
        student.setPhone(sc.nextLine());
        System.out.println("Hostel Name");
        student.setHostelName(sc.nextLine());
        System.out.println("Room Number");
        student.setRoomNumber(Integer.parseInt(sc.nextLine()));
        return student;
    }
}