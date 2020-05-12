import java.util.*;
class InitCap{
    static String convertToUpper(String str){
        StringBuffer s= new StringBuffer();
        char ch=' ';
        for(int i=0;i<str.length();i++){
            if(ch==' ' && str.charAt(i)!=' '){
                s.append(Character.toUpperCase(str.charAt(i)));
            }
            else
                s.append(str.charAt(i));
            ch=str.charAt(i);
        }
        return s.toString().trim();
    }
    public static void main(String  [] args){
        Scanner sc=new Scanner(System.in);
        String str,result;
        int check=0;
        System.out.println("Enter the String:");
        str=sc.nextLine();
        result=convertToUpper(str);
        for(int i=0;i<result.length();i++){
            if(result.charAt(i)==str.charAt(i))
                check=0;
            else{
                check=1;
                break;
            }
        }
        if(check==0)
            System.out.println("First character of each word is already in uppercase");
        else{
            System.out.println(result);
        }
    }
}