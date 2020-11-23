import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("kl-51c-7462", "scooty", "2 wheeler", 50000);
        vehicle.issueLoan();
        vehicle.takeInsurance();
    }
}
