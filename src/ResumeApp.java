
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

//
//        System.out.println("Now can your personal information");
//        System.out.println("Enter your full name");
//         personName= new Scanner(System.in).nextLine();
//        System.out.println("Enter your phone number");
//        phoneNum = new Scanner(System.in).nextInt();
//        System.out.println("Enter your email address");
//        emailAddress = new Scanner(System.in).nextLine();
//        Person person = new Person(personName, phoneNum, emailAddress);
//        System.out.println(person.toString());
//
//        System.out.println("****************************");

//        System.out.println("Now let's enter work experience");
//        System.out.println("Enter your current or most recent employer name");
//        companyName = new Scanner(System.in).nextLine();
//        System.out.println("Enter your job title");
//        jobTitle = new Scanner(System.in).nextLine();
//        System.out.println("Enter your at least one job description");
//        jobDescription = new Scanner(System.in).nextLine();
//        startDate = new Scanner(System.in).nextLine();
//        endDate = new Scanner(System.in).nextLine();
//        Resume resume = new Resume(companyName,jobTitle,jobDescription, startDate,endDate);                // Create a Resume object
//        System.out.println(resume.toString());
//
//        System.out.println("****************************");
//
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
//
//

//        Resume(String companyName, String jobTitle, String jobDescription, int startDate, int endDate)
//        Skill skill = new Skill();                   // Create a Skill object
//        Education education = new Education();       // Create a education object
//
//        Person Person = new Person();                // Create a Address object
//        System.out.println("Lets'Prepare your resume");
//        System.out.println("First enter your personal contact information");
//        System.out.println("Enter your full name");
//        String userName = applicant.nextLine();
//        System.out.println("Enter your Phone number");
//        int userPhone = applicant.nextInt();
//        System.out.println("Enter your email address");
//        String userEmail = applicant.next();


/*****
 System.out.println("Now let's enter work experience");
 System.out.println("Enter your current or most recent employer");
 userResumeResponse = applicant.nextLine();

 System.out.println("Enter your job title");
 userResumeResponse = applicant.nextLine();

 System.out.println("Enter your at least one job description");
 userResumeResponse = applicant.nextLine();

 System.out.println("You must enter at least three skills and rate them");
 System.out.println("Enter your skill 1");
 userResumeResponse = applicant.nextLine();
 System.out.println("Enter your skill 2");
 userResumeResponse = applicant.nextLine();
 System.out.println("Enter your skill 3");
 userResumeResponse = applicant.nextLine();

 System.out.println("Enter your start date");
 userResumeNum = applicant.nextInt();
 System.out.println("Enter your end date");
 userResumeNum = applicant.nextInt();

 System.out.println("Now let's enter your education history");
 System.out.println("Name of college/university attended");
 userResumeResponse = applicant.nextLine();

 System.out.println("Enter your major");
 userResumeResponse = applicant.nextLine();

 System.out.println("Enter degree earned");
 userResumeResponse = applicant.nextLine();

 System.out.println("Enter graduation year");
 userResumeResponse = applicant.nextLine();


 ****/


    }

}
