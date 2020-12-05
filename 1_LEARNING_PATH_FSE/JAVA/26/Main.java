import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//fill the code
		System.out.println("Enter the number of employees");
		int num = sc.nextInt();
		List<Employee> employee = new ArrayList<>();
		System.out.println("Enter the employee details");
		for(int i = 0; i < num; i++) {
		    String str = sc.next();
		    String[] emp = str.split(":");
		    employee.add(new Employee(emp[0], emp[1], Double.parseDouble(emp[2])));
		}
		System.out.println("Enter the number of times salary limit to be searched");
		int lim = sc.nextInt();
		Management[] mt = new Management[lim];
		for(int i = 0; i < lim; i++) {
		    System.out.println("Enter the salary limit to be searched");
		    int sal = sc.nextInt();
		    mt[i] = new Management(sal, employee);
		    mt[i].start();
		    
		    try {
		        mt[i].join();
		    } catch(InterruptedException e) {
		        e.printStackTrace();
		    }
		}
		
		for(int i = 0; i < lim; i++) {
		    System.out.printf("%.1f : %d\n", mt[i].getSalaryLimit(), mt[i].getCount());
		}
		
    }
}
