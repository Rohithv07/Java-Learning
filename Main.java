//fuel consumption calculator

import java.util.Scanner;

public class Main{
    
    public static float lit,dis,res1,res2;
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        lit = input.nextFloat();
        if(lit<0 || lit==0){
            System.out.printf("%.0f is an invalid input",lit);
            return;
        }
        
        System.out.println("Enter the distance covered");
        dis = input.nextFloat();
        if(dis<0 || dis==0){
            System.out.printf("%.0f is an invalid input",dis);
            return;
        }
        if(lit <0 ||dis <0 || dis==0 || lit==0){
            return;
        }
        else{
        System.out.println("Liters/100KM");
        res1=cons(lit,dis);
        System.out.printf("%.2f",res1);
        System.out.println("\nMiles/gallons");
        res2=gal(lit,dis);
        System.out.printf("%.2f",res2);
        }
    }
    public static float cons(float l, float d){
        return (l/d)*100;
    }
    public static float gal(float l, float d){
         double mile = d*0.6214;
         double gal = l*0.2642;
        return (float)mile/(float)gal;
    }
}