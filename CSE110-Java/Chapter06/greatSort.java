package Individual_Assignments.Chapter6;

import java.util.Scanner;

public class greatSort {
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
            System.out.println("\nThe inputs in ascending order : " + int1 + " " + int2 + " " + int3);
        }
        else if (int3 < int1 && int2 < int1){
            System.out.println("\nThe inputs in ascending order : " + int3 + " " + int2 + " " + int1);
        }
        else if (int1 > int2 && int3 > int2){
            System.out.println("\nThe inputs in ascending order : " + int1 + " " + int3 + " " + int2);
        }
        else if (int1 > int2 && int1 > int3 && int2 < int3){
            System.out.println("\nThe inputs in ascending order : " + int2 + " " + int3 + " " + int1);
        }
        else if (int1 == int2 || int2 == int3 || int1 == int3 && int1 > int2  || int1 > int3 || int2 > int3 || int3 > int2 || int3 > int1){
            System.out.println("\nThe inputs in ascending order : " + int3 + " " + int1 + " " + int2);
        }
        else {
            System.out.println("\nThe inputs in ascending order : " + int1 + " " + int2 + " " + int3);
        }
    }
}
