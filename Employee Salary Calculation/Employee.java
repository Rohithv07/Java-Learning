public class Employee{
    private int employeeId;
    private String employeeName;
    private double salary;
    private double netSalary;
    public int getEmployeeId(){
        return employeeId;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public double getSalary(){
        return salary;
    }
    public void setEmployeeId(int employeeId){
        this.employeeId=employeeId;
    }
    public void setEmployeeName(String employeeName){
        this.employeeName=employeeName;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public void calculateNetSalary(int pf){
        double temp=(pf/100.00);
        setNetSalary(salary-(salary*(temp)));
    }
    public void setNetSalary(double netSalary){
        this.netSalary=netSalary;
    }
    public double getNetSalary(){
        return netSalary;
    }
}