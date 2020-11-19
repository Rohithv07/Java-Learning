 import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import java.io.*;
import java.sql.*;

public class RainfallReport {

 //to generate rainfall report
 public List<AnnualRainfall> generateRainfallReport(String filePath) throws IOException,SQLException{
     
 
    List<AnnualRainfall> ar=new ArrayList<AnnualRainfall>();
    FileReader fr=new FileReader(filePath);
    BufferedReader br=new BufferedReader(fr);
    String d;
    while((d=br.readLine())!=null){
        AnnualRainfall aobj=new AnnualRainfall();
        StringTokenizer st=new StringTokenizer(d,",");
        String pincode=st.nextToken();
        if(validate(pincode)==true){
           
            aobj.setCityPincode(Integer.parseInt(pincode));
            String city=st.nextToken();
            aobj.setCityName(city);
            double monthlyRainfall[]=new double[12];
            int i=0;
            while(st.hasMoreTokens()){
                monthlyRainfall[i]=Double.parseDouble(st.nextToken());
                i++;
        }
        aobj.calculateAverageAnnualRainfall(monthlyRainfall);
          ar.add(aobj);  
        }
       
    }
        return ar;
 
 }
 // to find max rainfall cities
 public List<AnnualRainfall>  findMaximumRainfallCities() throws SQLException,IOException,ClassNotFoundException{
 
  List<AnnualRainfall> list=new ArrayList<AnnualRainfall>();
  DBHandler dobj=new DBHandler();
  Connection conn=dobj.establishConnection();
 
      Statement st=conn.createStatement();
      ResultSet rs=st.executeQuery("select city_name,city_pincode,average_annual_rainfall from AnnualRainfall where average_annual_rainfall=(select max(average_annual_rainfall) from AnnualRainfall);");
      while(rs.next()){
          AnnualRainfall aobj=new AnnualRainfall();
          aobj.setCityName(rs.getString(1));
          aobj.setCityPincode(rs.getInt(2));
          aobj.setAverageAnnualRainfall(rs.getDouble(3));
          list.add(aobj);
      }
      conn.close();
  return list;
 
 }
 
 // to validate pincode
 public boolean validate(String cityPincode){
 
 
  Pattern p = Pattern.compile("[0-9]{5}");
        Matcher m = p.matcher(cityPincode);
       
        boolean b = m.find();
        if (!b){
            try
        {
           
            throw new InvalidCityPincodeException("Invalid City Pincode");
        }
        catch (InvalidCityPincodeException ex)
        {
            System.out.println(ex);
        }
        return false;
        }
        return true;
     
 

           
     
 }

}
 ----Rainfall report-------




import java.util.*;
import java.io.*;
import java.sql.*;
public class Main {
   public static void main(String[] args) throws IOException,SQLException,InvalidCityPincodeException,ClassNotFoundException {
   
    //fill the code
    RainfallReport rainfallReport=new RainfallReport();
   
   List<AnnualRainfall> ar=rainfallReport.generateRainfallReport("RainFall/src/AllCityMonthlyRainfall.txt");
   List<AnnualRainfall> list=rainfallReport.findMaximumRainfallCities();
 
   }
}
-------Main------




public class InvalidCityPincodeException extends Exception{
public InvalidCityPincodeException(String s){
    super(s);
   
}
}
--------invalid city-------




import java.sql.Connection;
import java.util.*;
import java.io.*;
import java.sql.*;
import java.io.FileInputStream;
import java.sql.DriverManager;
import java.util.Properties;

public class DBHandler {
   

 //Write the required business logic as expected in the question description
 public Connection establishConnection() throws IOException,SQLException{

  //fill the code

  FileReader reader=new FileReader("RainFall/src/db.properties");
  Properties p=new Properties();
  p.load(reader);
  String url=p.getProperty("db.url");
  String classname=p.getProperty("db.classname");
  String user=p.getProperty("db.username");
  String password=p.getProperty("db.password");

 

 
 Connection con=null;
 try{
    // String url="jdbc:mysql://localhost:3306/RainFallReport";
       Class.forName(classname);
                con=DriverManager.getConnection(url,user,password);
   }
     catch(ClassNotFoundException ce){
         ce.printStackTrace();
         
     }
  catch(Exception e){
      e.printStackTrace();
     
  }
return con;
 }
 
}
-------db handler------




db.classname=com.mysql.jdbc.Driver
db.url=jdbc:mysql://localhost:3306/RainfallReport
db.username=
db.password=
--------db properties---------





public class AnnualRainfall {
 
 
 private int cityPincode;
 private String cityName;
 private double averageAnnualRainfall;

 public int getCityPincode() {
  return cityPincode;
 }

 public void setCityPincode(int cityPincode) {
  this.cityPincode = cityPincode;
 }

 public String getCityName(){
  return cityName;
 }

 public void setCityName(String cityName){
  this.cityName = cityName;
 }


 public double getAverageAnnualRainfall(){
  return averageAnnualRainfall;
 }


 public void setAverageAnnualRainfall(double averageAnnualRainfall){
  this.averageAnnualRainfall = averageAnnualRainfall;
 }

 //Write the required business logic as expected in the question description
 public void calculateAverageAnnualRainfall (double monthlyRainfall [ ]){
     
  //fill the code
  double sum=0.0;
  for(int i=0;i<monthlyRainfall.length;i++){
      sum+=monthlyRainfall[i];
  }
  double avg=sum/12.0;
  setAverageAnnualRainfall(avg);
 
 }


}
-------annual rainfall--------





drop database if exists RainfallReport;

create database RainfallReport

use RainfallReport;

create table AnnualRainfall(city_pincode int(5) primary key,city_name varchar(25),average_annual_rainfall double(6,2));

insert into AnnualRainfall values(10002,'New York',19.833);
insert into AnnualRainfall values(99501,'Alaska',22.666);
insert into AnnualRainfall values(20019,'Washington',35.006);
insert into AnnualRainfall values(30381,'Oxford',22.666);
insert into AnnualRainfall values(90080,'Angeles',42);

COMMIT;
-------script------