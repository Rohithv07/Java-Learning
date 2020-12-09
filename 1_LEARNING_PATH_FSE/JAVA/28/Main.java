
import java.util.Scanner;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// fill your code here
		TrainManagementSystem tm = new TrainManagementSystem();
		System.out.println("Enter the source");
		String source = sc.next();
		System.out.println("Enter the destination");
		String destination = sc.next();
		System.out.println("Enter the coach type");
		String coachType = sc.next();
		if(!(coachType.equalsIgnoreCase("AC1") || coachType.equalsIgnoreCase("AC2") || coachType.equalsIgnoreCase("AC3") || coachType.equalsIgnoreCase("Sleeper") || coachType.equalsIgnoreCase("Seater"))) {
		    System.out.println("Invalid coach type");
		    System.exit(0);
		}
		ArrayList<Train>details = new ArrayList<>();
		details = tm.viewTrain(coachType, source, destination);
		if (details.size() == 0)
		    System.out.println("No trains found");
		else {
		    for (Train t: details) {
		        System.out.println(t.getTrainNumber() + " " + t.getTrainName());
		    }
		}

		
	}
}
