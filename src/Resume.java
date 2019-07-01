public class Resume
{
    private String companyName="";
    private String jobTitle="";
    private String jobDescription="";
    private int startDate;
    private int endDate;


    public Resume()
    {
        //default runs in the background
        super();
        companyName="";
        jobTitle="";
        jobDescription="";
        startDate=0;
        endDate=0;

    }
    public Resume(String companyName, String jobTitle, String jobDescription, int startDate, int endDate)
    {
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.startDate = startDate;
        this.endDate = endDate;

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }


}
