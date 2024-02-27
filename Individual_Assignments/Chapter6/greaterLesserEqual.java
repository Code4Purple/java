package Individual_Assignments.Chapter6;

import java.util.Scanner;

public class greaterLesserEqual {
    public static void main(String[] args) {
        int int1 = 0;
        int int2 = 0;

        // input
        Scanner sncr = new Scanner(System.in);
        System.out.print("Enter first integer  : ");
        int1 = sncr.nextInt();
        System.out.print("Enter second integer : ");
        int2 = sncr.nextInt();

        // process
        if (int1 > int2) {
            System.out.println("\n" + int1 + " is greater than " + int2);
        } else if (int1 < int2) {
            System.out.println("\n" + int1 + " is less than " + int2);
        } else {
            System.out.println("\n" + int1 + " is equal to " + int2);
        }
    }
}
