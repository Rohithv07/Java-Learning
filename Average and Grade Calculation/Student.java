import java.util.*;
public class Student{
    private int id;
    private String name;
    private int marks [] =new int[20];
    private float average;
    private char grade;
    public Student(int i,String n,int [] mk){
        this.id=i;
        this.name=n;
        this.marks=mk;
        this.average=0;
        this.grade=' ';
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public float getAverage(){
        this.calculateAvg();
        return average;
    }
    public char getGrade(){
        this.findGrade();
        return grade;
    }
    public int [] getMarks(){
        return marks;
    }
    public void calculateAvg(){
        int s=0,t=0;
        for(int c:marks){
            t++;
            s+=c;
        }
        this.average=(float)s/(float)t;
    }
    public void findGrade(){
        int f=0;
        for(int k:marks){
            if(k<50){
                f=1;break;
            }
        }
        if(f!=1){
            if(this.average>=80 && this.average<=100)
                this.grade='O';
            else
                this.grade='A';
        }
        else
            this.grade='F';
    }
}