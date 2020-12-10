 //import necessary packages
 import java.util.*;
 import java.io.*;
 
 @SuppressWarnings("unchecked")//Do not delete this line
 public class FileManager 
 {
    
    static public File createFile() {
        try {
            File obj = new File("visitors.txt");
            obj.createNewFile();
            return obj;//change the return type as per the requirement    
        } catch (IOException e) {
            return null;
        }
    }
    static public void writeFile(File f, String record){
	    try {
	        FileWriter fw = new FileWriter(f, true);
	        fw.write(record);
	        fw.close();
	        
	    } catch(IOException e) {
	        System.out.println(e.toString());
	        return;
	    }
	} 
	static public String[] readFile(File f) {
	    String data = "";
	    try {
	        FileReader fr = new FileReader(f);
	        int i;
	        while ((i = fr.read()) != -1) {
	            data += (char)i;
	        }
	        fr.close();
	        return data.split(";");
	    } catch (IOException e) {
	        System.out.println(e.toString());
	        return null;
	    }
	}
 }
