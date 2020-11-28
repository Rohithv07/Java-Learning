import java.util.*;

public class ValidateUtility
{
    public static String employeeName;
    public static String productName;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        employeeName = sc.nextLine();
        productName = sc.nextLine();
        if (validateEmployeeName().validateName(employeeName))
            System.out.println("Employee name is valid");
        else
            System.out.println("Employee name is invalid");
        if (validateProductName().validateName(productName))
            System.out.println("Product name is valid");
        else
            System.out.println("Product name is invalid");
    }
    
    public static Validate validateEmployeeName() 
    {
        Validate validate = (name) -> {return name.matches("[A-Za-z ]{5,20}");
        };
        return validate;
    }
    
    public static Validate validateProductName() 
    {
        Validate valid = (name) -> {return name.matches("[A-Za-z]{1}[0-9]{5}");
        };
        return valid;
    }
}
