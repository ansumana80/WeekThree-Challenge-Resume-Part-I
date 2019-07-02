
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ResumeApp
{

    public static void main(String [] args) {
        Scanner applicant = new Scanner(System.in);  // Create a Scanner applicant
        Resume Resume = new Resume();                // Create a Resume object
        Address address = new Address();             // Create a Address object
        Skill skill = new Skill();                   // Create a Skill object
        Education education = new Education();       // Create a education object


        System.out.println("Lets'Prepare your resume");
        System.out.println("First enter your personal contact information");

        System.out.println("Enter your full name");
        String userResumeResponse = applicant.nextLine();

        address.setPersonName(userResumeResponse);

        System.out.println("Enter your Phone number");
        int userResumeNum = applicant.nextInt();

        //System.out.println("Enter your email address");
        //userResumeResponse = applicant.nextLine();
        System.out.println("----" + address.printAddress());


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
