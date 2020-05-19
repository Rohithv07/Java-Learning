import java.io.*;
public class FileDemo
{
    public static void main(String[] args)
    {
        InputStream istream;
        OutputStream ostream;
        int c;
        final int EOF=-1;
        ostream=System.out;
        try{
            File inputFile=new File("log.txt");
            istream=new FileInputStream(inputFile);
            try{
                while((c=istream.read())!=EOF)
                    ostream.write(c);
            }catch(IOException e){
                System.out.println("Error: "+e.getMessage());
            }finally{
                try{
                    istream.close();
                    ostream.close();
                }catch(IOException e){
                    System.out.println("File did not close");
                }
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}