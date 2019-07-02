public class Education extends Resume
{
    private String uName;       // name of university
    private String uMajor;      //example Chemical Engineering
    private String degreeType;  // Associate(default), Bachelor, Master, PhD.
    private int gradYear;       // year graduation


    public Education()
    {
        //default runs in the background
        super();
        uName="";
        uMajor="";
        degreeType="associate";
        gradYear=0;
    }

    public Education(String companyName, String jobTitle, String jobDescription, int startDate, int endDate,
                            String uName, String uMajor, String degreeType, int gradYear) {
        super(companyName, jobTitle, jobDescription, startDate, endDate);
        this.uName = uName;
        this.uMajor = uMajor;
        this.degreeType = degreeType;
        this.gradYear = gradYear;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuMajor() {
        return uMajor;
    }

    public void setuMajor(String uMajor) {
        this.uMajor = uMajor;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public String Education()
    {
        return getuName() + " " + getuMajor()+ " "+ getDegreeType()+ " "+ getGradYear();
    }
}
