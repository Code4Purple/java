// File: PaintingWall.java
// Date: 01/29/2023
// Name: Bennie Kowalski
// Description: Paints a wall with a given height and width
// Assigment : Lab 02 - Painting a Wall

package Labs;

import java.util.Scanner;

public class PaintingWall {
    public static void main (String[] args) {
        // input function declaration
        Scanner scnr = new Scanner(System.in);
        // variable declaration
        double height; 
        double width; 
        double area; 
        double gallons;
        // inputs for height and width
        System.out.print("Enter the height of the wall (feet): "); // Input Test: 12
        height = scnr.nextDouble();

        System.out.print("Enter the width of the wall (feet): "); // Input Test: 15
        width = scnr.nextDouble();
        

        // calculations
        area = height * width;
        gallons = area / 350; // 350 square feet per gallon of paint
        
        // outputs
        System.out.printf("\nWall area : %.0f square feet\n", area);            // Output Test: 180
        System.out.printf("Paint needed : %.2f gallons\n", gallons);            // Output Test: 0.51
        System.out.printf("Cans needed : %.0f can(s)\n", Math.ceil(gallons));   // Output Test: 1
    }
}
