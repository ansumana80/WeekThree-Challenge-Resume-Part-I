public class Resume
{
    private String companyName;
    private String jobTitle;
    private String jobDescription;
    private String startDate;
    private String endDate;


    public Resume()
    {

        companyName="";
        jobTitle="";
        jobDescription="";
        startDate="";
        endDate="";

    }
    public Resume(String companyName, String jobTitle, String jobDescription, String startDate, String endDate)
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String Resume()
    {
        return("Company: " +getCompanyName()+ "\n"+ "Job Title: " +getJobTitle()+ "\n"+
                "Job Description: " +getJobDescription()+ "\n"+
                "Start Date: " +getStartDate()+ "\n"+ ("End Date: " +getEndDate()+ "\n"));
    }

    @Override
    public String toString() {
        return "Resume{" +
                "companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
