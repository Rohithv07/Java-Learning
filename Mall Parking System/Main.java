import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Main{
    public static void main(String [] args){
        String date="";
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date inDate,outDate,currentDate=null;
        try{
            currentDate=format.parse("29/10/2019 20:10");
        }catch(Exception e){}
        try{
            System.out.println("In-time");
            date=sc.nextLine();
            inDate=format.parse(date);
            if(currentDate.getTime()-inDate.getTime()<60000 || inDate.getTime()>currentDate.getTime()){
                System.out.println(date+" is an Invalid In-Time");
                return;
            }
        }catch(Exception e){
            System.out.println(date+" is an Invalid In-Time");
            return;
        }
        try{
            System.out.println("Out-time");
            date=sc.nextLine();
            outDate=format.parse(date);
            if(outDate.getTime() - inDate.getTime()<60000){
                System.out.println(date+" is an Invalid Out-Time");
                return;
            }
        }catch(Exception e){
            System.out.println(date+" is an Invalid Out-Time");
            return;
        }
        double diff=outDate.getTime()-inDate.getTime();
        double hours=Math.ceil(diff/3600000);
        System.out.println((int)(hours*10)+" Rupees");
    }
}