import java.util.*;
public class Library{
    private List<Member> memberList=new ArrayList<Member>();
    public void setMemberList(List<Member> memberList){
        this.memberList=memberList;
    }
    public List<Member> getMemberList(){
        return this.memberList;
    }
    public void addMember(Member memberObj){
        memberList.add(memberObj);
    }
    public List<Member> viewAllMembers(){
        return memberList;
    }
    public List<Member> viewMembersByAddress(String address){
        List<Member> l=new ArrayList<Member>();
        for(Member m:memberList)
            if(address.compareTo(m.getAddress())==0)
                l.add(m);
        return l;
    }
}