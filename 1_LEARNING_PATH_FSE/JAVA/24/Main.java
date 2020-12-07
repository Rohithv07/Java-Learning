import java.util.Scanner;
import java.util.stream.Stream;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		//Fill your code here
		System.out.println("Enter all roll numbers separated by comma");
		String rollNo = sc.next();
		System.out.println("Enter the department name acronym");
		String dpt = sc.next();
		int count = Main.getCount(Main.getRollNumbers(rollNo), dpt);
		if(count > 0)
            System.out.print("Number of students in " + dpt + " is " + count);
        else
            System.out.print("No students from " + dpt);
	}

	public static Stream<String> getRollNumbers(String rollNumbers) {
		//Fill your code here
		List<String> student = new ArrayList<>();
		String[] rollNo = rollNumbers.split(",");
		for (String roll: rollNo) {
		    student.add(roll);
		}
        return student.stream();

	}

	public static int getCount(Stream<String> rollNumberStream, String dept) {
		//Fill your code here
        String acr = dept.toLowerCase();
        long count = rollNumberStream.map((x) -> x.toLowerCase()).filter((x) ->
        x.contains(acr)).count();
        return (int)count;


	}

}

