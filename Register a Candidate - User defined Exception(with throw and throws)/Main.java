import java.util.*;
public class Main{
    public static void main(String [] args){
        try{
            getCandidateDetails();
            System.out.println("Registration Successful");
        }catch(InvalidSalaryException e){
            System.out.println(e.getMessage());
        }
    }
    public static Candidate getCandidateDetails() throws InvalidSalaryException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the candidate Details");
        System.out.println("Name");
        String name=sc.nextLine();
        System.out.println("Gender");
        String gender=sc.nextLine();
        System.out.println("Expected Salary");
        Double salary=sc.nextDouble();
        if(salary<10000){
            throw new InvalidSalaryException("Registration Failed.Salary cannot be less than 10000.");
        }
        Candidate candidate=new Candidate();
        candidate.setName(name);
        candidate.setGender(gender);
        candidate.setExpectedSalary(salary);
        return candidate;
        }
}