import java.util.*;
public class Main{
    public static Employee getEmployeeDetails(){
        Scanner sc=new Scanner(System.in);
        Employee e=new Employee();
        System.out.println("Enter id:");
        e.setEmployeeId(sc.nextInt());
        System.out.println("Enter Name:");
        e.setEmployeeName(sc.next());
        System.out.println("Enter salary:");
        e.setSalary(sc.nextDouble());
        return e;
    }
    public static int getPFPercentage(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter PF percentage:");
        int val=sc.nextInt();
        return val;
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        Employee e=getEmployeeDetails();
        int temp=getPFPercentage();
        e.calculateNetSalary(temp);
        System.out.println("Id : "+e.getEmployeeId());
        System.out.println("Name : "+e.getEmployeeName());
        System.out.println("Salary : "+e.getSalary());
        System.out.println("Net Salary : "+e.getNetSalary());
    }
}