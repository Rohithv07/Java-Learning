import java.util.stream.Stream;
import java.util.*;

public class EmployeeUtility {

	public Employee[] getEmployeeDetails(String[] details) {

		//Fill your code here
        Employee[] empData = new Employee[details.length];
        int i = 0;
        for(String empDet : details) {
            String[] str = empDet.split(";");
            Employee emp = new Employee();
            emp.setEmpId(str[0]);
            emp.setEmpName(str[1]);
            emp.setSalary(Double.parseDouble(str[2]));
            empData[i] = emp;
            i++;
        }
        return empData;


	}

	public Stream<Employee> getStreamOfEmployee(Employee[] empDetails) {

		//Fill your code here
        Stream<Employee> emplist = Arrays.stream(empDetails);
        return emplist;


	}

	public String[] shortlistedEmployee(Stream<Employee> empStream,double minSalary) {

		//Fill your code here
		String[] result = empStream.filter(x -> x.getSalary() >= minSalary).map(x -> x.toString()).sorted().toArray(String[]::new);
        return result;




	}

}
