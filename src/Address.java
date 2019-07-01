public class Address extends Resume
{
    private String studentName="";
    private int streetNum;
    private String streetAddress;
    private String city;
    private String state;
    private int zipCode;
    private int phoneNum=0;
    private String emailAddress="";

    public Address()
    {
        super();
        studentName="";
        streetNum=0;
        streetAddress="";
        city="";
        state="";
        zipCode=0;
        phoneNum=0;
        emailAddress="";
    }

    public Address(String studentName, int streetNum, String streetAddress, String city, String state, int zipCode,
                   int phoneNum, String emailAddress) {
        this.studentName = studentName;
        this.streetNum = streetNum;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNum=phoneNum;
        this.emailAddress = emailAddress;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
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
}

