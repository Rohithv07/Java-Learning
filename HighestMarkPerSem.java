import java.util.*;
class HighestMarkPerSem{
    private static int maximum(int [] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of semester:");
        int numberOfSemester=sc.nextInt();
        
        int [] sem=new int[numberOfSemester+1];
        int [] max=new int[numberOfSemester+1];
        int [] marks=new int[100];
        for(int i=1;i<=numberOfSemester;i++){
            System.out.println("Enter no of subjects in "+i+" semester:");
            sem[i]=sc.nextInt();
            
        }
        for(int i=1;i<=numberOfSemester;i++){
            System.out.println("Marks obtained in semester "+i+":");
           
            for(int j=1;j<=sem[i];j++){
                marks[j]=sc.nextInt();
                if(marks[j]<0 || marks[j]>100){
                    System.out.println("You have entered invalid mark.");
                    System.exit(1);
                }
            }
            max[i]=maximum(marks);
            marks=new int[100];
        }
        for(int i=1;i<=numberOfSemester;i++){
            System.out.println("Maximum mark in "+i+" semester:"+max[i]);
        }
        
    }
}