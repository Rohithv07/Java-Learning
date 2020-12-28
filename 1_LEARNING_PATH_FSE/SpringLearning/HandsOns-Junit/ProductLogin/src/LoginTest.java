import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assert.*;


public class LoginTest {
    
    LoginDAO loginDao = new LoginDAO();
    Login login;
    
    @Test
    public void testDeleteLogin_CannotDelete() {
        login = null;
        assertFalse(loginDao.addLogin(login));
        assertFalse(loginDao.deleteLogin(login));
    }
    
    @Test
    public void testDeleteLogin_CanDelete() {
        login = new Login("abc", "abc123");
        assertTrue(loginDao.addLogin(login));
        assertTrue(loginDao.deleteLogin(login));
    }
    

}

