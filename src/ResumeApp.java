
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ResumeApp {

    public static void main(String[] args) {
        String companyName;
        String jobTitle;
        String jobDescription;
        String startDate;
        String endDate;
        String skillName="";
        String skillRating="";
        String personName;
        int phoneNum;
        String emailAddress;


        System.out.println("Now can your personal information");
        System.out.println("Enter your full name");
         personName= new Scanner(System.in).nextLine();
        System.out.println("Enter your phone number");
        phoneNum = new Scanner(System.in).nextInt();
        System.out.println("Enter your email address");
        emailAddress = new Scanner(System.in).nextLine();
        Person person = new Person(personName, phoneNum, emailAddress);
        System.out.println(person.toString());

        System.out.println("****************************");

        System.out.println("Now let's enter work experience");
        System.out.println("Enter your current or most recent employer name");
        companyName = new Scanner(System.in).nextLine();
        System.out.println("Enter your job title");
        jobTitle = new Scanner(System.in).nextLine();
        System.out.println("Enter your at least one job description");
        jobDescription = new Scanner(System.in).nextLine();
        startDate = new Scanner(System.in).nextLine();
        endDate = new Scanner(System.in).nextLine();
        Resume resume = new Resume(companyName,jobTitle,jobDescription, startDate,endDate);                // Create a Resume object
        System.out.println(resume.toString());

        System.out.println("****************************");

        System.out.println("Now let's job skill and skill rating");
        System.out.println("You must enter at least three skills. Rate them as either Fundamental,Fundamental, Novice, " +
                "intermediate, Advanced, Expert");
        String skillName1 = new Scanner(System.in).nextLine();
        String skillRating1 = new Scanner(System.in).nextLine();
        String skillName2 = new Scanner(System.in).nextLine();
        String skillRating2 = new Scanner(System.in).nextLine();
        String skillName3 = new Scanner(System.in).nextLine();
        String skillRating3 = new Scanner(System.in).nextLine();
        Skill skill = new Skill(skillName, skillRating);
        System.out.println(skill.toString());
        System.out.println("****************************");

        System.out.println("Now let enter education");

        System.out.println("Enter University");
        String uName= new Scanner(System.in).nextLine();
        System.out.println("Enter your major");
        String uMajor= new Scanner(System.in).nextLine();
        System.out.println("Enter your degree Type");
        String degreeType = new Scanner(System.in).nextLine();
        System.out.println("Enter your graduation year");
        int gradYear = new Scanner(System.in).nextInt();
        Education education = new Education(uName, uMajor, degreeType,gradYear);
        System.out.println(education.toString());

        System.out.println("****************************");



    }

}
