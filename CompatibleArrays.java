import java.util.*;
class CompatibleArrays{
    static void isComaptible(int [] arr1,int [] arr2){
        boolean flag=true;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>=arr2[i]){
                flag=true;
            }
            else{
                flag=false;
                break;
            }
        }
        if(flag)
            System.out.println("Arrays are Compatible");
        else
            System.out.println("Arrays are Not Compatible");
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int size1,size2;
        System.out.println("Enter the size for First array:");
        size1=sc.nextInt();
        if(size1<=0){
            System.out.println("Invalid array size");
            System.exit(1);
        }
        int [] arr1=new int[size1];
        System.out.println("Enter the elements for First array:");
        for(int i=0;i<size1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the size for Second array:");
        size2=sc.nextInt();
        if(size2<=0){
            System.out.println("Invalid array size");
            System.exit(1);
        }
        int [] arr2= new int [size2];
        System.out.println("Enter the elements for Second array:");
        for(int i=0;i<size2;i++){
            arr2[i]=sc.nextInt();
        }
        if(size1!=size2){
            System.out.println("Arrays are Not Compatible");
            System.exit(1);
        }
        isComaptible(arr1,arr2);
    }
    
}