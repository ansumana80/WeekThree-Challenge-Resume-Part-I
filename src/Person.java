public class Person extends Resume
{
    private String PersonName="";
    private int phoneNum=0;
    private String emailAddress="";

    public Person()
    {
        super();
        PersonName="";
        phoneNum=0;
        emailAddress="";
    }

    public Person (String personName, int phoneNum, String emailAddress){
        super();
        this.PersonName= personName;
        this.phoneNum=phoneNum;
        this.emailAddress=emailAddress;


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


    public String Person()
    {
        return ("Full Name: " +getPersonName() + "\n" + "Phone: " +getPhoneNum() + "\n" + "Email: " +getEmailAddress()
                + "\n");
    }

    @Override
    public String toString() {
        return "Person{" +
                "PersonName='" + PersonName + '\'' +
                ", phoneNum=" + phoneNum +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}

