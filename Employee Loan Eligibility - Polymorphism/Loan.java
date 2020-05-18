public class Loan {
	public double loan;
	
	public double calculateLoanAmount(Employee employeeObj) {
		if(employeeObj instanceof PermanentEmployee)
		    loan=0.15*employeeObj.getSalary();
		else if(employeeObj instanceof TemporaryEmployee)
		    loan=0.1*employeeObj.getSalary();
		
		return loan;
    }

}
