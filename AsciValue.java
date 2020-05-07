import java.util.*;
class AsciValue{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int data[]=new int[4];
        System.out.println("Enter the digits:");
        for(int i=0;i<4;i++){
            int input=s.nextInt();
            data[i]=input;
        }
        for(int j=0;j<4;j++){
            System.out.println(data[j]+"-"+(char)data[j]);
        }
    }
}