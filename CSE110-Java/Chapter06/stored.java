package Individual_Assignments.Chapter6;

import java.util.Scanner;

public class stored {
    public static void main(String[] args) {
        int int1 = 0;
        int int2 = 0;
        int int3 = 0;

        // input
        Scanner sncr = new Scanner(System.in);
        System.out.print("Enter first integer  : ");
        int1 = sncr.nextInt();
        System.out.print("Enter second integer : ");
        int2 = sncr.nextInt();
        System.out.print("Enter third integer  : ");
        int3 = sncr.nextInt();

        // process
        if (int1 < int2 && int2 < int3){
            System.out.println("\nThe inputs are in ascending order.");
        }
        else if (int1 == int2 && int2 < int3){
            System.out.println("\nThe inputs are in ascending order.");
        }
        else {
            System.out.println("\nThe inputs are NOT in ascending order.");
        }
    }
}
