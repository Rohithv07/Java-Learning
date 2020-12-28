import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {
    
    Customer customer = new Customer("2212345432123455", "rahul", "jayan", "address", 98765432, "abc@gmail.com");
    
    @Test
    public void testIsValidAadharNumber_ValidCase() {
        Assert.assertTrue(customer.isValidAadharNo("234567890989"));
    }
    
    @Test
    public void testIsValidAadharNumber_InvalidCase() {
        Assert.assertFalse(customer.isValidAadharNo("034567890989"));
    }
    
    @Test
    public void testFirstNameAndLastNameNotEqual() {
        Assert.assertNotEquals(customer.getFirstName(), customer.getLastName());
    }
    
    @Test
    public void testEmailIdNotNull() {
        Assert.assertNotNull(customer.getEmailId());
    }
}
