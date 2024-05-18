package Individual_Assignments.Chapter4_Chapter5;

import java.util.Scanner;

public class stoplights {
    public static void main(String[] args){
        // inputs
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter the number of miles of road      : ");
        double miles = scnr.nextDouble();
        System.out.print("Enter the number of lanes on this road : ");
        int lanes = scnr.nextInt();

        // processing
        double intersections = Math.floor(miles); 
        double stoplights = intersections * (2 + lanes);
        double cost = stoplights * 25000;

        System.out.printf("Number of intersections : %.0f\n", intersections);
        System.out.printf("Number of stoplights    : %.0f\n", stoplights);
        System.out.printf("Cost of stoplights      : $%.2f\n",cost);

        
    }
}
