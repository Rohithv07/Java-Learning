import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBHandler {
    
    private static Connection con = null;
	private static Properties props = null;
	private static FileInputStream fis = null;

    public static Connection establishConnection()  throws ClassNotFoundException, SQLException {
		try{
			fis = new FileInputStream("db.properties");
			props = new Properties();
			props.load(fis);

			// load the Driver Class
			Class.forName(props.getProperty("db.classname"));

			// create the connection now
            con = DriverManager.getConnection(props.getProperty("db.url"),props.getProperty("db.username"),props.getProperty("db.password"));
	    }
	    catch(IOException e){
	        e.printStackTrace();
	    }
		return con;	
	}
}