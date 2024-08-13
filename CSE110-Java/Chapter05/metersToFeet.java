package Individual_Assignments.Chapter4_Chapter5;

import java.util.Scanner;

public class metersToFeet {
    public static void main (String[] args){
        // inputs
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter distance in Meters : ");
        double meters = scnr.nextDouble();
        // processing
        double metersToInches = meters * 39.37;
        double feet = Math.floor(metersToInches / 12.0);
        double inches = metersToInches % 12;

        //outputs
        System.out.printf("\n%.2f meters is %.0f feet and %.2f inches\n", meters, feet, inches);

    }
}
