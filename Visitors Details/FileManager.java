 //import necessary packages
 import java.io.*;
 import java.util.*;
 @SuppressWarnings("unchecked")//Do not delete this line
 public class FileManager 
 {
     static public File createFile(){
         try{
             File file=new File("visitors.txt");
             file.createNewFile();
             return file;
         }catch(IOException e){
             return null;
         }
     }
     static public void writeFile(File f,String record){
         try{
             FileWriter fw=new FileWriter(f,true);
             fw.write(record);
             fw.close();
         }catch(IOException e){
             System.out.println(e.getMessage());
             return;
         }
     }
     static public String [] readFile(File f){
         String data="";
         try{
             FileReader fr=new FileReader(f);
             int i;
             while((i=fr.read())!=-1){
                 data+=(char)i;
             }
             fr.close();
             return data.split(";");
         }catch(Exception e){
             System.out.println(e.getMessage());
             return null;
         }
     }
 }