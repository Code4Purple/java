package Individual_Assignments.Chapter7;

import java.util.Scanner;

public class courseInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter course info : ");
        String courseInfo = input.nextLine();
        //String courseInfo = "CSE 110 11178 Principles of Programming";

        String subject = courseInfo.substring(0, courseInfo.indexOf(" "));
        String courseNumber = courseInfo.substring(courseInfo.indexOf(" ") + 1, courseInfo.indexOf(" ", courseInfo.indexOf(" ") + 1));
        String sectionNumber = courseInfo.substring(courseInfo.indexOf(" ", courseInfo.indexOf(" ") + 1) + 1, courseInfo.indexOf(" ", courseInfo.indexOf(" ", courseInfo.indexOf(" ") + 1) + 1));
        String courseTitle = courseInfo.substring(courseInfo.indexOf(" ", courseInfo.indexOf(" ", courseInfo.indexOf(" ") + 1) + 1) + 1);

        System.out.println("Subject        : " + subject);
        System.out.println("Course Number  : " + courseNumber);
        System.out.println("Section Number : " + sectionNumber);
        System.out.println("Course Title   : " + courseTitle);
    }    
}
