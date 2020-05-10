import java.util.*;
class CumulativeSum{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int [] sumArray=new int[20];
        System.out.println("Enter number of elements");
        int numberOfElements=sc.nextInt();
        int sum=0;
        if(numberOfElements<=0){
            System.out.println("Invalid range");
            //System.exit(1);
        }
        else{
            System.out.println("Enter the elements");
            for(int i=0;i<numberOfElements;i++){
                sumArray[i]=sc.nextInt();
            }
            for(int i=0;i<numberOfElements;i++){
                sum+=sumArray[i];
                System.out.print(sum+" ");
            }
        }
        
    }
}