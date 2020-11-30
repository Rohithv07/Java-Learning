import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	private static Map <String,Double> employeeMap;

	public Map<String, Double> getEmployeeMap() {
		return employeeMap;
	}

	public void setEmployeeMap(Map<String, Double> employeeMap) {
		this.employeeMap = employeeMap;
	}
	
	public void addEmployeeDetails(String employeeName, double salary) {
	    employeeMap.put(employeeName, salary);
	}
	
	
	
	public static EmployeeAudit findEmployee() {
		ArrayList<String> name=null;
		EmployeeAudit employeeAudit = (salary) -> {
		    for (String key: employeeMap.keySet()) {
		        if (employeeMap.get(key) <= salary)
		            name.add(key);
		    }
		    return name;
		};
		return employeeAudit;
	}
	
	public static void main(String[] args) {
	    Main main = new Main();
		int choice;
		Scanner sc=new Scanner(System.in);
		do {
		    System.out.println("1.Add Employee Details");
		    System.out.println("2.Find Employee Details");
		    System.out.println("3.Exit");
		    System.out.println("Enter the choice");
		    choice = sc.nextInt();
		    switch(choice) {
		        case 1: System.out.println("Enter the Employee name");
    		        String empName = sc.nextLine();
    		        System.out.println("Enter the Employee Salary");
    		        double empSalary = sc.nextDouble();
    		        main.addEmployeeDetails(empName, empSalary);
    		        break;
    		    case 2: System.out.println("Enter the salary to be searched");
    		        double searchSalary = sc.nextDouble();
    		        ArrayList<String> listOfName = main.findEmployee().fetchEmployeeDetails(searchSalary);
    		        if (listOfName == null)
    		            System.out.println("No Employee Found");
    		        else {
    		            for (String names: listOfName)
    		                System.out.println(names);
    		        }
    		        break;
    		    case 3: System.out.println("Lets complete the session");
    		            System.exit(0);
		    }
		}while (choice != 3);
		
	}

}

