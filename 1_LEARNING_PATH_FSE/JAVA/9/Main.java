import java.util.*;
public class Main {
    public static Scanner sc = new Scanner(System.in);
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
        student.setRoomNumber(sc.nextInt());
        return student;
    }
    public static void main(String [] args) {
        Hosteller student = getHostellerDetails();
        System.out.println("Modify Room Number(Y/N)");
        String choiceRoom = sc.next();
        if (choiceRoom == "Y") {
            System.out.println("New Room Number");
            student.setRoomNumber(sc.nextInt());
        }
        System.out.println("Modify Phone Number(Y/N)");
        String choicePhone = sc.next();
        if (choicePhone == "Y") {
            System.out.println("New Phone Number");
            student.setPhone(sc.nextLine());
        }
        System.out.println("The Student Details");
        System.out.print(student.getStudentId() + " " + student.getName() + " " +
        student.getDepartmentId() + " " + student.getGender() + " " + student.getPhone() + " " + student.getHostelName() +
        " " + student.getRoomNumber());
    }
}