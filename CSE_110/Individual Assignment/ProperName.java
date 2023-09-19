import java.util.Scanner;

public class ProperName {
    public static void main(String[] args){
        // Variables
        String properName;
        int totalLength;
        
        int firstSpace;
        String firstName;

        int secondSpace;
        String lastName;
        String middleName;

        char firstInitial;
        char middleInitial;

        // Input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a proper name : ");
        properName = scan.nextLine();

        // Processes
        firstSpace = properName.indexOf(" ");
        firstName = properName.substring(0, firstSpace);

        secondSpace = properName.lastIndexOf(" ");
        middleName = properName.substring(firstSpace + 1,secondSpace);
        lastName = properName.substring(secondSpace + 1, properName.length());
        totalLength = firstName.length() + middleName.length() + lastName.length();

        firstInitial = properName.charAt(0);
        middleInitial = properName.charAt(firstSpace + 1);
        

        
        
        // Outputs
        System.out.println("Total characters    : " + totalLength);
        System.out.println("First name          : " + firstName);
        System.out.println("Middle name         : " + middleName);
        System.out.println("Last name           : " + lastName);
        System.out.println("First initial       : " + firstInitial);
        System.out.println("Middle initial      : " + middleInitial);
        System.out.println("Last name first     : " + lastName + ", " + firstName + " " + middleName );
        System.out.println("Short form          : " + firstInitial + ". " + middleInitial + ". " + lastName );
    }
} 