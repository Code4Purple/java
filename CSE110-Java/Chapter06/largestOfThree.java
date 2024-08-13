package Individual_Assignments.Chapter6;

import java.util.Scanner;

public class largestOfThree {
     public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int int1 = 0;
        int int2 = 0;
        int int3 = 0;
        int output = 0;

        // input
        System.out.print("Enter first integer  : ");
        int1 = scnr.nextInt();
        System.out.print("Enter second integer : ");
        int2 = scnr.nextInt();
        System.out.print("Enter third integer  : ");
        int3 = scnr.nextInt();

        // process
        if (int1 > int2 && int1 > int3){
            output = int1;
        }
        if (int2 > int1 && int2 > int3){
            output = int2;
        }
        if (int3 > int1 && int3 > int2){
            output = int3;
        }
        if (int1 == int2 && int1 == int3 && int2 == int3 ){
            output = int1;
        }
        if (int1 == int3 && int1 > int2){
            output = int1; 
         }

        System.out.println("\nThe largest is : " + output);
    }
}
