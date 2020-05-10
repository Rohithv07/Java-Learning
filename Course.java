import java.util.*;
class Course{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int noOfCourse;
        String key;
        System.out.println("Enter no of course:");
        noOfCourse=Integer.parseInt(sc.nextLine());//important
        if(noOfCourse<=0){
            System.out.println("Invalid Range");
            System.exit(1);
        }
        System.out.println("Enter course names:");
        String [] courseName=new String[noOfCourse];
        for(int i=0;i<noOfCourse;i++){
            courseName[i]=sc.nextLine();
        }
        System.out.println("Enter the course to be searched:");
        key=sc.nextLine();
        if(Arrays.asList(courseName).contains(key)){
            System.out.println(key+" course is available");
        }
        else{
            System.out.println(key+" course is not available");
        }
    }
}