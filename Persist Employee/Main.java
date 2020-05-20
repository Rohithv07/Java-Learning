import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]){
        String file="employee.txt";
        File f=new File(file);
        try{
            f.createNewFile();
        }catch(Exception e){}
        Employee e1=new Employee(1,"Rohith",10);
        Employee e2=new Employee(2,"V Rohith",10);
        ArrayList<Employee> employeeList=new ArrayList<Employee>();
        employeeList.add(e1);
        employeeList.add(e2);
        EmployeeUtility emp=new EmployeeUtility();
        emp.addEmployee(file,employeeList);
        Employee employee=emp.viewEmployeeById(file,2);
        System.out.println(employee.getName());
        
    }
}