import java.util.*;
public class StudentMain{
    public static Student getStudentDetails(){
        int id;
        String s;
        int m=0;
        int [] mk=new int[20];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the id:");
        id=sc.nextInt();
        System.out.println("Enter the name:");
        s=sc.next();
        while(m==0){
            System.out.println("Enter the no of subjects:");
            m=sc.nextInt();
            if(m==0)
                System.out.println("Invalid number of subject");
        }
        for(int i=0;i<m;i++){
            System.out.println("Enter mark for subject "+(i+1)+":");
            mk[i]=sc.nextInt();
            while(!(mk[i]>=0 && mk[i]<=100)){
                System.out.println("Invalid mark");
                System.out.println("Enter mark for subject "+(i+1)+":");
                mk[i]=sc.nextInt();
            }
        }
        Student st=new Student(id,s,mk);
        return st;
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        Student st=getStudentDetails();
        System.out.println("Id:"+st.getId());
        System.out.println("Name:"+st.getName());
        System.out.println("Average:"+st.getAverage());
        System.out.println("Grade:"+st.getGrade());
    }
}