
import java.util.Scanner;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// fill your code here
        System.out.println("Enter the minimum range");
        int minimumRange = sc.nextInt();
        System.out.println("Enter the maximum range");
        int maximumRange = sc.nextInt();
        MobileManagementSystem mb = new MobileManagementSystem();
        Map<Integer, Integer> result = new LinkedHashMap<>();
        result = mb.viewMobileWithInTheRange(minimumRange, maximumRange);
        if (result.size() == 0)
            System.out.println("No mobiles found for the given range");
        else {
            for (int key: result.keySet()) {
                System.out.println(key + ":" + result.get(key));
            }
        }
		
	}
}
