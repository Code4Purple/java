package Individual_Assignments.Chapter4_Chapter5;

import java.util.Scanner;

public class caffeineLevels {
    public static void main(String[] args){

        // Inputs
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter caffeine amount (in mg) : ");
        double caffeine = scnr.nextDouble();

        // Processing
        int record = 18;
        int halfLife = 2;

        // Outputs
        for (int i = 6; i <= record; i += 6) {
            caffeine = caffeine / halfLife;
            if (i == 6){
                System.out.printf("\nAfter %d hours  : %.2f mg", i, caffeine);
                continue;
            }
            System.out.printf("\nAfter %d hours : %.2f mg", i, caffeine);
        }
    }
}
