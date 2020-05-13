import java.util.*;
class PasswordValidation{
    public static void main(String [] args){
        String securityCode;
        String patterCheck="^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[@,*,#]).{8,}$";
        Scanner sc=new Scanner(System.in);
        System.out.println("Generate your Security Code");
        securityCode=sc.nextLine();
        if(securityCode.matches(patterCheck))
            System.out.println("Security Code Generated Successfully");
        else    
            System.out.println("Invalid Security Code,Try Again!");
    }
}