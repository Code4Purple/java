package Individual_Assignments.Chapter6;

import java.util.Scanner;

public class largestOfTwo {
    public static void main(String[] args) {
        Scanner sncr = new Scanner(System.in);
        
        int int1 = 0;
        int int2 = 0;
        int output = 0;

        // input
        System.out.print("Enter first integer  : ");
        int1 = sncr.nextInt();

        System.out.print("Enter second integer : ");
        int2 = sncr.nextInt();

        // process 
        if (int1 > int2) {
            output = int1;
        } 

        if (int2 > int1) {
            output = int2;
        }

        if (int1 == int2) {
            output = int1;
        }

        System.out.println("\nThe largest is : " + output);
    }    
}
