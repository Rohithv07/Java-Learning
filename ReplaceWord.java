import java.util.*;
class ReplaceWord{
    static boolean isPresent(String str1,String str2){
        if(str1.contains(str2))
            return true;
        return false;
    }
    static String replaceWord(String str1,String str2,String str3){
        return str1.replace(str2,str3);
    }
    public static void main(String [] args){
        String sentence;
        Scanner sc=new Scanner(System.in);
        String searchWord;
        String replacingWord;
        System.out.println("Enter the string:");
        sentence=sc.nextLine();
        System.out.println("Enter the word to be searched:");
        searchWord=sc.nextLine();
        System.out.println("Enter the word to be replaced:");
        replacingWord=sc.nextLine();
        if(isPresent(sentence,searchWord)){
            System.out.println(replaceWord(sentence,searchWord,replacingWord));
        }
        else{
            System.out.println("The word "+searchWord+" not found");
        }
    }
}