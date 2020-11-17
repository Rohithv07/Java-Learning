import java.util.*;
public class Main{
    public static void findMinimum(String [] item, int [] amount) {
        // initialise small as amount[0]
        int small = amount[0];
        int j = 0;
        int [] pos = new int [100];
        pos[0] = 0;
        for (int i=1; i<amount.length; i++) {
            if (amount[i] < small) {
                small = amount[i];
                pos[0] = i;
            }
            else if (amount[i] == small) {
                j += 1;
                pos[j] = i;
            }
        }
        for (int k=0; k<j+1; k++) {
            System.out.println(item[pos[k]]);
        } 
    }
    public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
     int number = sc.nextInt();
     String product;
     sc.nextLine();
     String [] items = new String [number];
     int [] price = new int [number];
     String [] inputSeparated;
     for (int i=0; i<number; i++) {
         product = sc.nextLine();
         inputSeparated = product.split(",");
         items[i] = inputSeparated[0];
         price[i] = Integer.parseInt(inputSeparated[1]) * Integer.parseInt(inputSeparated[2]) / 100;
     }
        findMinimum(items, price);
    }
}