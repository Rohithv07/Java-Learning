import java.util.*;
class FindFactor{
    private static void factors(int n){
        if(n==0){
            System.out.println("No Factors");
        }
        else if(n<0){
            int temp=n*-1;
            for(int i=1;i<=temp;i++){
                if(temp%i==0){
                    System.out.print(i+",");
                }
            }
        }
        else{
            for(int j=1;j<=n;j++){
                if(n%j==0){
                    System.out.print(j+",");
                }
            }
        }
        System.out.print("\b");
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        factors(number);
    }
}