import java.util.*;
public class StudentMain{
    public static void main(String [] args){
        Student st;
        int id;
        Scanner sc=new Scanner(System.in);
        String name,addr,c,cc;
        c=" ";
        System.out.println("Enter Student's Id:");
        id=sc.nextInt();
        System.out.println("Enter Student's Name:");
        name=sc.nextLine();
        System.out.println("Enter Student's address:");
        addr=sc.nextLine();
        while(c=="YES" || c=="yes" || c=="NO" || c=="no"){
            System.out.println("Whether the student is from NIT(Yes/No):");
            c=sc.nextLine();
            if(!(c=="YES" || c=="yes" || c=="NO" || c=="no"))
                System.out.println("Wrong Input");
        }
        if(c=="NO" || c=="no"){
            System.out.println("Enter the college name:");
            cc=sc.nextLine();
            st=new Student(id,name,addr,cc);
        }
        else{
            st=new Student(id,name,addr);
        }
        System.out.println("Student id:"+st.getStudentId());
        System.out.println("Student name:"+st.getStudentName());
        System.out.println("Address:"+st.getStudentAddress());
        System.out.println("College name:"+st.getCollegeName());
    }
}