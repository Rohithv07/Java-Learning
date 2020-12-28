import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assert.*;

public class ProductTest {
    
    ProductDAO productDao = new ProductDAO();
    Product product;
    
    @Test
    public void testDeleteProduct_CannotDelete() {
        product = null;
        assertFalse(productDao.addProduct(product));
        assertFalse(productDao.deleteProduct(product));
    }
    
    @Test
    public void testDeleteProduct_CanDelete() {
        product = new Product("1", "ABC", 100);
        assertTrue(productDao.addProduct(product));
        assertTrue(productDao.deleteProduct(product));
    }
    
    @Test
    public void testDeleteProduct_CanDeleteOrNot() {
        product = new Product();
        assertTrue(productDao.addProduct(product));
        assertTrue(productDao.deleteProduct(product));
    }
    
    @Test
    public void testDeleteProduct_CanDeleteSettingValue() {
        product = new Product();
        product.setProductId("ID01");
        product.setProductName("Iphone");
        product.setPrice(200.20);
        assertTrue(productDao.addProduct(product));
        assertTrue(productDao.deleteProduct(product));
    }
}
