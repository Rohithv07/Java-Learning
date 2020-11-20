public class Loan {
	public double loanAmount;
	public double calculateLoanAmount(Employee employeeObj) {
		if (employeeObj instanceof PermanentEmployee)
		    loanAmount = 0.15 * employeeObj.getSalary();
		else if (employeeObj instanceof TemporaryEmployee) {
		    loanAmount = 0.1 * employeeObj.getSalary();
		}
		return loanAmount;
	}
}
