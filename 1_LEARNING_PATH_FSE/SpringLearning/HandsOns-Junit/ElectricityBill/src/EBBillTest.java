import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;


public class EBBillTest {
    EBBill ebBill;
    
    @Test
    public void testCalculateBillAmount_Unit0() {
        ebBill = new EBBill(0);
        assertTrue(0 == ebBill.calculateBillAmount());
    }
    
    @Test
    public void testCalculateBillAmount_LessThanEqualTo50() {
        ebBill = new EBBill(50);
        assertTrue(130 == ebBill.calculateBillAmount());
    }
    
    @Test
    public void testCalculateBillAmount_LessThanEqualTo100() {
        ebBill = new EBBill(100);
        assertTrue(292.5 == ebBill.calculateBillAmount());
    }
    
    @Test
    public void testCalculateBillAmount_LessThanEqualTo200() {
        ebBill = new EBBill(200);
        assertTrue(818.5 == ebBill.calculateBillAmount());
    }
    
    @Test
    public void testCalculateBillAmount_LessThanEqualTo1000() {
        ebBill = new EBBill(1000);
        assertTrue(7018.5 == ebBill.calculateBillAmount());
    }
    
    @Test
    public void testCalculateBillAmount_LessThanEqualTo5000() {
        ebBill = new EBBill(5000);
        assertTrue(47018.5 == ebBill.calculateBillAmount());
    }
        
}