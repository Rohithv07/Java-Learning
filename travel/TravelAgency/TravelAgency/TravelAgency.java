import java.util.List;
import java.util.*;
import java.io.*;
import java.sql.*;

public class TravelAgency {
	public List<Package> generatePackageCost(String filePath) {
		List<Package> list = new ArrayList<>();
		try {
	        File file = new File(filePath);
    	    FileReader fr = new FileReader(file);  
            BufferedReader br=new BufferedReader(fr); 
            String line;  
            //Extract package details from file
            while((line=br.readLine())!=null)  
            {  
    	        String[] columns = line.split(",");
                String packageId = columns[0];
                try {
                    //validate the package id
                    if(this.validate(packageId)) {
                        Package p = new Package();
                        p.setPackageId(packageId);
                        p.setSourcePlace(columns[1]);
                        p.setDestinationPlace(columns[2]);
                        p.setBasicFare(Integer.parseInt(columns[3]));
                        p.setNoOfDays(Integer.parseInt(columns[4]));
                        p.calculatePackageCost();
                        list.add(p);
                    }
                } catch (InvalidPackageIdException e) {
                    System.out.println(e.getMessage() + " : " + packageId);
                }
            }
            br.close();
	    } catch (Exception e) {
			System.out.println(e.getMessage());
	        return null;
	    }
		return list;
	}
	
	public boolean validate(String packageId) throws InvalidPackageIdException {
		if(!packageId.matches("[A-Za-z0-9]{3}/[A-Za-z0-9]{3}") ) {
	        throw new InvalidPackageIdException("Invalid Package Id");
	    }
	    return true;
	}
	
	
	public List<Package> findPackagesWithMinimumNumberOfDays() {
		List<Package> list = new ArrayList<>();
	    try {
	        //Establish database connection
    	    Connection conn = DBHandler.establishConnection();
    	    String sql = "SELECT * FROM package_details WHERE no_of_days =(SELECT MIN(no_of_days) FROM package_details as min_days)";
    	    //fetch records from database
    	    Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            //Extract data from result set
            while(rs.next()){
                // add data to package object
                Package p = new Package();
                p.setPackageId(rs.getString("package_id"));
                p.setSourcePlace(rs.getString("source_place"));
                p.setDestinationPlace(rs.getString("destination_place"));
                p.setPackageCost(rs.getDouble("package_cost"));
                p.setNoOfDays(rs.getInt("no_of_days"));
                list.add(p);
            }
            //close connection and result set
            rs.close();
            conn.close();
	    }
	    catch (Exception e) {
			System.out.println(e.getMessage());
	        return null;
	    }
		return list;
	}
}
