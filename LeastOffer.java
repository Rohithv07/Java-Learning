//least offer

import java.util.Scanner;
public class LeastOffer{
    
    public static void main (String[] args) 
    {
    Scanner s=new Scanner(System.in);
    int number=s.nextInt();
    String input;
    s.nextLine();
    String item[]=new String[number];
    int amount[]=new int[number];
    String[] seperated_input;
    for(int i=0;i<number;i++)
    {
        input=s.nextLine();
        seperated_input=input.split(",");
        item[i]=seperated_input[0];
        amount[i]=Integer.parseInt(seperated_input[1])*Integer.parseInt(seperated_input[2])/100;
    }
    find(item,amount);    
         
    }
    private static void find(String[] item,int[] amount)
    {
        int small=amount[0],j=0;
        int pos[]=new int[100];
        pos[0]=0;
        for(int i=1;i<amount.length;i++)
        {
            if(amount[i]<small)
            {
                small=amount[i];
                pos[0]=i;
            }
            else if(amount[i]==small)
            {
                j++;
                pos[j]=i;
            }
        }
        for(int k=0;k<j+1;k++)
        {
        System.out.println(item[pos[k]]);
        }
    }
     
     
     // Fill the code here
        
    }
