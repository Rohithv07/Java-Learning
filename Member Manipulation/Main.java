import java.util.*;
import java.lang.*;
public class Main{
    public static void main (String[] args){
     Scanner sc=new Scanner(System.in);
     int ch;
     List<Member> list=new ArrayList<Member>();
     Member member=new Member();
     Library library=new Library();
     do{
     System.out.println("1.Add Member");
     System.out.println("2.View all Members");
     System.out.println("3.Search Member by address");
     System.out.println("4.Exit");
     System.out.println("Enter your choice:");
     ch=Integer.parseInt(sc.nextLine());
     switch(ch){
         case 1:{
             try{
             System.out.println("Enter the id:");
             member.setMemberId(Integer.parseInt(sc.nextLine()));
             System.out.println("Enter the name:");
             member.setMemberName(sc.nextLine());
             System.out.println("Enter the address:");
             member.setAddress(sc.nextLine());
             library.addMember(member);}
            catch(Exception e){
                System.out.println(e.toString());
            }
             break;
         }
         case 2:{
             try{
             list=library.viewAllMembers();
             for(Member m:list){
                  System.out.println("Id:"+m.getMemberId());
                 System.out.println("Name:"+m.getMemberName());
                 System.out.println("Address:"+m.getAddress());
         }
             }
             catch(Exception e){ System.out.println(e.toString());}
         break;
     }
     case 3:{
         try{
         System.out.println("Enter the address:");
         String a=sc.nextLine();
         list=library.viewMembersByAddress(a);
         /*library.setMemberList(list);*/
         boolean f=list.isEmpty();
         if(!f)
         for(Member m:list){
             System.out.println("Id:"+m.getMemberId());
                 System.out.println("Name:"+m.getMemberName());
                 System.out.println("Address:"+m.getAddress());
         }
         else
          System.out.println("None of the member is from "+a);
         }
         catch(Exception e){ System.out.println(e.toString());}
         break;
     }
     case 4:System.exit(0);
     }
     }while(ch!=5);
    }
}
         