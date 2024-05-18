// File: asphalt.java
// Date: 02/05/2023
// Name: Bennie Kowalski
// Assigment : Lab 03 - Truckloads of Asphalt

package Labs;

import java.util.Scanner;

public class asphalt {
    public static void main (String[] args) {
        // input function declaration
        Scanner scnr = new Scanner(System.in);
        
        // Inputs
        System.out.print("Enter length of road inches       : "); 
        double miles = scnr.nextDouble();
        System.out.print("Enter number of lanes             : ");
        int lanes = scnr.nextInt();
        System.out.print("Enter depth of asphalt in inches  : ");
        int depth = scnr.nextInt();

        // Processing
        double length_feet = miles * 5280;
        double lanes_feet = lanes * 12;
        double depth_feet = depth / 12.0;

        double cubicFeet = length_feet * lanes_feet * depth_feet;
        //System.out.print("\n" + length_feet + " * " + lanes_feet + " * " + depth_feet + " = " + cubicFeet);
        double pounds = cubicFeet * 145.0;
        //System.out.print("\n" + cubicFeet + " * 145 = " + pounds);
        double tons = pounds / 2000;
        //System.out.print("\n" + pounds + " / 2000 = " + tons);
        double truckLoads = tons / 5;
        //System.out.print("\n" + tons + " / 5 = " + truckLoads);
        double cost = Math.ceil(truckLoads) * 5 * 150;
        //System.out.print("\n" + truckLoads + " * 5 * 150 = " + cost + "\n");
        

        // Outputs
        System.out.printf("\nTruckloads of asphalt needed is  : %.0f\n", Math.ceil(truckLoads));
        System.out.printf("Total cost of asphalt is         : $%.2f\n", cost);
    }
}

// test 1 input : 1 2 12 -> output : 1838 1378500.00
// test 2 input : 2.75 3 10 -> output : 6317 4737750