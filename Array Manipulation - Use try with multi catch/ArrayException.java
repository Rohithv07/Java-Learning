import java.util.*;
public class ArrayException{
    public String getPriceDetails(){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter the number of elements in the array");
            int num=Integer.parseInt(sc.nextLine());
            System.out.println("Enter the price details");
            int [] arr=new int[num];
            for(int i=0;i<num;i++){
                arr[i]=Integer.parseInt(sc.nextLine());
            }
            System.out.println("Enter the index of the array elements you want to access");
            int ind=Integer.parseInt(sc.nextLine());
            return "The array element is "+arr[ind];
            }catch(ArrayIndexOutOfBoundsException e){
                return "Array index is out of range";
            }catch(InputMismatchException e){
                return "Input was not in the correct format";
            }catch(NumberFormatException e){
                return "Input was not in the correct format";
            }
        }
    public static void main(String [] args){
        ArrayException are=new ArrayException();
        System.out.println(are.getPriceDetails());
    }
}