import java.util.*;
public class Main {
    public static Candidate getCandidateDetails() throws InvalidSalaryException{
        Candidate candidate = new Candidate();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the candidate Details");
        System.out.println("Name");
        candidate.setName(sc.nextLine());
        System.out.println("Gender");
        candidate.setGender(sc.next());
        System.out.println("Expected Salary");
        candidate.setExpectedSalary(sc.nextDouble());
        double salary = candidate.getExpectedSalary();
        if (salary < 10000)
            throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000");
        return candidate;
    }
    public static void main (String [] args) {
        try {
            Candidate candidate = getCandidateDetails();
            System.out.println("Registration Successful");
        }catch (InvalidSalaryException e) {
            System.out.println(e.getMessage());
        }
    }
}
