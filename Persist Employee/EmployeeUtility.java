import java.util.*;
import java.io.*;
public class EmployeeUtility {
    public boolean addEmployee(String fileName,ArrayList<Employee> employeeList){
        try{
            FileOutputStream writeData=new FileOutputStream(fileName);
            ObjectOutputStream writeStream=new ObjectOutputStream(writeData);
            writeStream.writeObject(employeeList);
            writeStream.flush();
            writeStream.close();
        }catch(IOException e){
            e.printStackTrace();
            return false;
        }
        return true;
        }
        public Employee viewEmployeeById(String fileName,int employeeId){
            ArrayList<Employee> employeeList=new ArrayList<>();
            Employee employee=null;
            try{
                FileInputStream readData=new FileInputStream(fileName);
                ObjectInputStream readStream=new ObjectInputStream(readData);
                employeeList=(ArrayList) readStream.readObject();
                readStream.close();
                for(Employee e:employeeList){
                    if(e.getEmployeeId()==employeeId){
                        employee=e;
                        break;
                    }
                }
            }catch (IOException | ClassNotFoundException e){
                e.printStackTrace();
            }
            return employee;
        }
}