// mall parking system



import java.util.*;
import java.text.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String date = "";
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date inTime;
        Date outTime;
        Date currentDate = null;
        try {
            currentDate = format.parse("29/10/2019 20:10");
        }catch(Exception e) {}
        try{
            System.out.println("In-time");
            date=sc.nextLine();
            inTime=format.parse(date);
            if(currentDate.getTime()-inTime.getTime()<60000 || inTime.getTime() > currentDate.getTime()){
                System.out.println(date+" is an Invalid In-Time");
                return;
            }
        }catch(Exception e){
            System.out.println(date+" is an Invalid In-Time");
            return;
        }
        try {
            System.out.println("Out-time");
            date = sc.nextLine();
            outTime = format.parse(date);
            if (outTime.getTime() - inTime.getTime() < 60000 ) {
                System.out.println(date + " is an invalid Out-Time");
                return;
            }
        }catch(Exception e) {
            System.out.println(date+" is an Invalid Out-Time");
            return;
        }
        double diff = outTime.getTime() - inTime.getTime();
        double hours=Math.ceil(diff / 3600000);
        System.out.println((int) (hours * 10) + " Rupees");
    }
}
