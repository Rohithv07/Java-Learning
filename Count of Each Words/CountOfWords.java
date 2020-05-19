//import the necessary packages if needed
import java.util.*;
     
@SuppressWarnings("unchecked")//Do not delete this line
public class CountOfWords
{
    static void lowerCase(String sentence){
        sentence.toLowerCase();
    }
  public static void main(String [] args){
        String sentence;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student's Article");
        sentence=sc.nextLine();
        String [] array=sentence.split("[ ,;:.?!]+");
        for(int i=0;i<array.length;i++){
            array[i]=array[i].toLowerCase();
        }
        System.out.println("Number of words "+array.length);
        Arrays.sort(array);
        //boolean [] visited=new boolean[visited];
        int [] fr = new int [array.length];  
        int visited = -1;  
        for(int i=0;i<array.length;i++){
            int count=1;
            for(int j = i+1; j < array.length; j++){  
                if(array[i].equals(array[j])){  
                    count++;  
                    //To avoid counting same element again  
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }  
        System.out.println("Words with the count");
         for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println(array[i] + ": "+fr[i]);  
        }  
    }
}