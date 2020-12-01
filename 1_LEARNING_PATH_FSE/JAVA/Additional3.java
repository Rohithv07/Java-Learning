import java.util.*;

public class CinemaTicket {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	float number, total = 0, discount1=0, discount2=0, cost=0;
	String refreshment, coupon, circle;
	System.out.print("Enter the no of ticket:");
	number = sc.nextInt();
	sc.nextLine();
	if(number>=5 && number<=40) {
		System.out.print("Do you want refreshment:");
		refreshment = sc.nextLine();
		System.out.print("Do you have coupon code:");
		coupon = sc.nextLine();
		System.out.print("Enter the circle:");
		circle = sc.nextLine();
		if(circle.contentEquals("k")) {
			total = number * 75;
		}
		else if(circle.contentEquals("q")) {
			total = number * 150;
		}
		else {
			System.out.println("Invalid Input");
			System.exit(1);
		}
		if(refreshment.contentEquals("y")) {
			cost = number * 50;
		}
		if(number > 20) {
			discount1 = total * 10 / 100;
			total = total - discount1;
			if(coupon.contentEquals("y")) {
				discount2 = total * 2 / 100;
			}
		}
		else{
		    if(coupon.contentEquals("y")) {
				discount2 = total * 2 / 100;
			}
		}
		total = total - discount2 + cost;
		System.out.printf("Ticket cost:%.2f",total);
	}
	else {
		System.out.println("Minimum of 5 and Maximum of 40 Tickets");
	}
}
}
