import java.util.*;

public class ArrayException {
    public String getPriceDetails() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the number of elements in the array");
            int size = Integer.parseInt(sc.nextLine());
            int [] priceArray = new int [size];
            System.out.println("Enter the price details");
            for (int i=0; i<size; i++)
                priceArray[i] = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the index of the array element you want to access");
            int index = Integer.parseInt(sc.nextLine());
            return "The array element is " + priceArray[index];
        }catch (ArrayIndexOutOfBoundsException e) {
            return "Array index is out of range";
        }catch (InputMismatchException e) {
            return "Input was not in the correct format";
        }catch (NumberFormatException e) {
            return "Input was not in the correct format";
        }
    }
    public static void main (String [] args) {
        ArrayException arrayException = new ArrayException();
        System.out.println(arrayException.getPriceDetails());
    }
}
