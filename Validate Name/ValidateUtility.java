import java.util.*;
public class ValidateUtility
{
    public static String name;
    public static String ProductName;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        ProductName=sc.nextLine();
        if(validateEmployeeName().validateName(name)){
            System.out.println("Employee name is valid");
        }else{
            System.out.println("Employee name is invalid");
        }
        if(validateProductName().validateName(ProductName)){
            System.out.println("Product name is valid");
        }else{
            System.out.println("Product name is invalid");
    }
}
    public static Validate validateEmployeeName(){
        Validate valid=(name)->{return name.matches("[A-Za-z ]{5,20}");
    };
    return valid;
    }
    public static Validate validateProductName(){
        Validate valid=(name)->{
            return name.matches("[A-Za-z]{1}[0-9]{5}");
        };
        return valid;
    }
}