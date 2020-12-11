import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.*;

public class ParticipantUtility {
	List<Participant> participantList = new ArrayList<Participant>();

	public List<Participant> getParticipantList() {
		return participantList;
	}

	public void setParticipantList(List<Participant> participantList) {
		this.participantList = participantList;
	}
	
	public void addParticipant(Participant pObj) {
		// Fill your code here
		participantList.add(pObj);
	}
	
	public Stream<Participant> viewAllParticipants(String departmentName,String collegeName) {
		// Fill your code here
		List<Participant> l=new ArrayList<Participant>();
		for(Participant p:participantList){
		    if(p.getDepartmentName().equals(departmentName) && p.getCollegeName().equals(collegeName)){
		        l.add(p);
		    }
		}
		l.sort((p1,p2)->p1.getParticipantName().compareTo(p2.getParticipantName()));
		Stream<Participant> s=l.stream();
		return s;
	}
}
