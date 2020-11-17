import java.util.*;
public class Main {
    public static float forLiter(float liter, float distance) {
        return (liter / distance) * 100;
    }
    public static float forGallon(float liter, float distance) {
        double kmToMiles = distance * 0.6214;
        double literToGallon = liter * 0.2642;
        return (float)kmToMiles / (float)literToGallon;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        float liter = sc.nextFloat();
        // base case if negative
        if (liter <= 0.0) {
            System.out.printf("%.0f is an Invalid Input", liter);
            System.exit(0);
        }
        System.out.println("Enter the distance covered");
        float distance = sc.nextFloat();
        // base condition for distance
        if (distance <= 0) {
            System.out.printf("%.0f is an Invalid Input", distance);
            System.exit(0);
        }
        // calculation for liters/ 100
        float answerInLiters = forLiter(liter, distance);
        float answerInGallons = forGallon(liter, distance);
        System.out.println("Liters/100KM");
        System.out.printf("%.2f", answerInLiters);
        System.out.println("\nMiles/gallons");
        System.out.printf("%.2f", answerInGallons);
    }
}