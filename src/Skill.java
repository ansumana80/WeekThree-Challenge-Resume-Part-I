public class Skill extends Resume
{

    private String skillName="";    // bank reconciliation, fixed asset account reconciliation
    private String skillRating=""; //Fundamental, Novice, intermediate, Advanced, Expert

    public Skill ()
    {
        super();
        this.skillName="";
        this.skillRating="";
    }

    public Skill(String companyName, String jobTitle, int startDate, int endDate, String jobDescription, String skillName, String skillRating)
    {
        super(companyName, jobTitle, jobDescription, startDate, endDate);
        this.skillName = skillName;
        this.skillRating = skillRating;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillRating() {
        return skillRating;
    }

    public void setSkillRating(String skillRating) {
        this.skillRating = skillRating;
    }

    public String Skill()
    {
        return getSkillName()+ " "+ getSkillRating();
    }


}
