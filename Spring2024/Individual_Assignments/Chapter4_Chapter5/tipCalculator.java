package Individual_Assignments.Chapter4_Chapter5;

import java.util.Scanner;

public class tipCalculator {
    public static void main(String[] ags){
        // inputs
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter the check amount : ");
        double checkAmount = scnr.nextDouble();
        System.out.println();

        // Processing 
        double tip10 = checkAmount * 0.10;
        double tip15 = checkAmount * 0.15;
        double tip20 = checkAmount * 0.20;
        double tip25 = checkAmount * 0.25;
        double tip30 = checkAmount * 0.30;

        // Outputs
        System.out.printf("Total with 10%% tip ($%.2f) is $%.2f\n", tip10, checkAmount + tip10);
        System.out.printf("Total with 15%% tip ($%.2f) is $%.2f\n", tip15, checkAmount + tip15);
        System.out.printf("Total with 20%% tip ($%.2f) is $%.2f\n", tip20, checkAmount + tip20);
        System.out.printf("Total with 25%% tip ($%.2f) is $%.2f\n", tip25, checkAmount + tip25);
        System.out.printf("Total with 30%% tip ($%.2f) is $%.2f\n", tip30, checkAmount + tip30);
    

    }
}
