import java.util.*;
public class SnacksDetails {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int pizzaPrice = 100;
        int puffsPrice = 20;
        int coolDrinkPrice = 10;
        System.out.println("Enter the no of pizzas bought:");
        int numberOfPizza = sc.nextInt();
        System.out.println("Enter the no of puffs bought:");
        int numberOfPuffs = sc.nextInt();
        System.out.println("Enter the no of cool drinks bought:");
        int numberOfCoolDrinks = sc.nextInt();
        System.out.println("Bill Details");
        System.out.println("No of pizzas:" + numberOfPizza);
        System.out.println("No of puffs:" + numberOfPuffs);
        System.out.println("No of cooldrinks:" + numberOfCoolDrinks);
        int totalPrice = (pizzaPrice * numberOfPizza) + (puffsPrice * numberOfPuffs) + (coolDrinkPrice * numberOfCoolDrinks);
        System.out.println("Total price=" + totalPrice);
        System.out.println("ENJOY THE SHOW!!!");
    }
}
