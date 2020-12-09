import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception{
	
		// fill your code here
		Scanner sc = new Scanner(System.in);
		PlayerSelectionSystem ps = new PlayerSelectionSystem();
		System.out.println("Enter the minimum height");
		int height = sc.nextInt();
		System.out.println("Enter the maximum height");
		int weight = sc.nextInt();
		List<String> namesOfPlayers = ps.playersBasedOnHeightWeight(height, weight);
		if(namesOfPlayers.size() == 0) {
		    System.out.println("No players are with minimum height of " + height + ".0 and maximum weight of " + weight + ".0");
		    System.exit(0);
		}
		else {
		    for(String name: namesOfPlayers) {
		        System.out.println(name);
		    }
		}
		

		
	}
}
