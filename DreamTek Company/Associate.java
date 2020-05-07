public class Associate{
    private int associateId;
    private String associateName;
    private String workStatus;
    public Associate()
    {
        return;
    }
    public int getAssociateId()
    {
        return this.associateId;
    }
    public void setAssociateId(int associateId)
    {
        this.associateId=associateId;
    }
    public String getAssociateName()
    {
        return this.associateName;
    }
    public void setAssociateName(String associate_Name)
    {
        this.associateName=associate_Name;
    }
    public String getWorkStatus()
    {
        return this.workStatus;
    }
    public void setWorkStatus(String work_Status)
    {
        this.workStatus=work_Status;
    }
    public void trackAssociateStatus(int no_of_days)
    {
        if(no_of_days<=20)
        {
            setWorkStatus("Core skills");
        }
        else if(no_of_days<=40)
        {
            setWorkStatus("Advanced modules");
        }
        else if(no_of_days<=60)
        {
            setWorkStatus("Project phase");
        }
        else
        {
            setWorkStatus("Deployed in project");
        }
    }
}