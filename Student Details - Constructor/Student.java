public class Student{
    private int studentId;
    private String studentName,studentAddress,collegeName;
    public Student(int id,String name,String addr){
        this.studentId=id;
        this.studentName=name;
        this.studentAddress=addr;
        this.collegeName="NIT";
    }
    public Student(int id,String name,String addr,String college){
        this.studentId=id;
        this.studentName=name;
        this.studentAddress=addr;
        this.collegeName=college;
    }
    public String getStudentName(){
        return studentName;
    }
    public int getStudentId(){
        return studentId;
    }
    public String getStudentAddress(){
        return studentAddress;
    }
    public String getCollegeName(){
        return collegeName;
    }
}