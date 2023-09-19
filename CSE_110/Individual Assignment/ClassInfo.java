import java.util.Scanner;

public class ClassInfo {
    public static void main(String[] args){
        
        // Input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter course info : ");
        String classInfo = scan.nextLine();

        // Getting Info
            // Class ID
        int firstId = classInfo.indexOf(" ");
        String classId = classInfo.substring(0, firstId);
            // Class Number
        int secondId = classInfo.indexOf(" ", firstId + 1);
        String courseNum = classInfo.substring(firstId, secondId);
            // Section Number
        int thirdId = classInfo.indexOf(" ", secondId + 1);
        String section = classInfo.substring(secondId, thirdId);
            // Course Title
        int fourthId = classInfo.indexOf(" ", thirdId);
        int fifthId = classInfo.lastIndexOf(" ");
        String courseTitle = classInfo.substring(fourthId, fifthId);
        String courseEnd = classInfo.substring(fifthId);
        // Outputs
        System.out.println("Subject        : " + classId);
        //System.out.println(secondId);
        System.out.println("Course Number  :" + courseNum);
        System.out.println("Section Number :" + section);
        System.out.println("Course Title   :" + courseTitle + courseEnd);

    
    }
}
