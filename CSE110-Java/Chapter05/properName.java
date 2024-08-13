// Lab 5: Proper Name

package Labs;

import java.util.Scanner;

public class properName {
    public static void main(String[] args) {
        Scanner sncr = new Scanner(System.in);
        System.out.print("Enter a proper name: ");
        String name = sncr.nextLine();

        // Total Length of the name
        int totalChars = name.length() - 2;
        // First & Last Space of the proper name to the values for substring 
        int firstSpace = name.indexOf(" ");
        int lastSpace = name.lastIndexOf(" ");
        // First, Middle, and Last Name
        String firstName = name.substring(0, firstSpace);
        String middleName = name.substring(firstSpace + 1, lastSpace);
        String lastName = name.substring(lastSpace + 1, totalChars + 2);
        // First, Middle, and Last Initials
        char firstInitial = firstName.charAt(0);
        String middleNameInitial = name.substring(firstSpace + 1, firstSpace + 2);
        String lastInitial = name.substring(lastSpace + 1, lastSpace + 2);
        // Output
        System.out.println();
        System.out.println("Total characters    : " + totalChars);
        System.out.println("First name          : " + firstName);
        System.out.println("Middle name         : " + middleName);
        System.out.println("Last name           : " + lastName);
        System.out.println("First initial       : " + firstInitial);
        System.out.println("Middle initial      : " + middleNameInitial);
        System.out.println("Last name first     : " + lastName + ", " + firstName + " " + middleName);
        System.out.println("Short form          : " + firstInitial + ". " + middleNameInitial + ". " + lastName);
    }
}
