import java.util.*;
class UniqueChar{
    static final int NO_OF_CHARS=256;
    static String uniqueCharacter(String str){
        int [] count=new int[NO_OF_CHARS];
        String result="";
        int i;
        for(i=0;i<str.length();i++)
            if(str.charAt(i)!=' ')
                count[(int)str.charAt(i)]++;
        int n=i;
        for(i=0;i<n;i++)
            if(count[(int)str.charAt(i)]==1)
                result=result+Character.toString(str.charAt(i));
        
        return result;
        }
    public static boolean isAlphabet(String str){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetter(ch) || ch==' '){
                continue;
            }
            return false;
        }
        return true;
    }
  
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String sentence;
        System.out.println("Enter the sentence");
        sentence=sc.nextLine();
        if(!isAlphabet(sentence)){
            System.out.println("Invalid Sentence");
            System.exit(1);
        }
            String result=uniqueCharacter(sentence);
            if(result.length()==0){
                System.out.println("No unique characters");
            }
            else{
                System.out.println("Unique characters:");
                for(int i=0;i<result.length();i++){
                    System.out.println(result.charAt(i));
                }
            }
    }
}