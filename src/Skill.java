public class Skill extends Resume
{

    private String skillName="";    // bank reconciliation, fixed asset account reconciliation
    private String skillRating=""; //Fundamental, Novice, intermediate, Advanced, Expert

    public Skill ()
    {
//        super();
        this.skillName="";
        this.skillRating="";
    }

    public Skill(String skillName, String skillRating)
    {
        super();
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
        return ("Skill Name: " +getSkillName()+ "\n"+ "Skill Rating: " +getSkillRating()+"\n");
    }

    @Override
    public String toString() {
        return "Skill{" +
                "skillName='" + skillName + '\'' +
                ", skillRating='" + skillRating + '\'' +
                '}';
    }
}
