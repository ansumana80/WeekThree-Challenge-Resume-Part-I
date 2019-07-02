public class Address extends Resume
{
    private String PersonName="";
    private int phoneNum=0;
    private String emailAddress="";

    public Address()
    {
        super();
        PersonName="";
        phoneNum=0;
        emailAddress="";
    }

    public Address(String companyName, String jobTitle, String jobDescription, int startDate, int endDate,
                   String personName, int phoneNum, String emailAddress) {
        super(companyName, jobTitle, jobDescription, startDate, endDate);
        PersonName = personName;
        this.phoneNum = phoneNum;
        this.emailAddress = emailAddress;
    }



    public String getPersonName() {
        return PersonName;
    }

    public void setPersonName(String personName) {
        this.PersonName = PersonName;
    }


    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public  String printAddress()
    {

        return this.getPersonName() + " "+ this.getPhoneNum()+ " "+ this.getEmailAddress();
    }
}

