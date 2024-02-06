package Individual_Assignments.Chapter4_Chapter5;

import java.util.Scanner;

public class inchesToMeters {
    static public void main(String[] args) {
        // inputs
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter Feet    : ");
        double feet = scnr.nextDouble();
        System.out.print("Enter Inches  : ");
        double inches = scnr.nextDouble();

        // processing
        double meters = ((feet * 12) + inches) / 39.37;

        System.out.printf("%.0f\' and %.2f\" is %.2f meters\n", feet, inches, meters);
    }
}
