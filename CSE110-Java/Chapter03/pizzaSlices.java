// File: pizzaSlices.java
// Name: Bennie Kowalski
// Date: 01/29/2023
// Assignment: 3.24 Individual Assignment

package Individual_Assignments.Chapter3;

import java.util.Scanner;

public class pizzaSlices {
    public static void main(String[] args){
        // Input Function
        Scanner scnr = new Scanner(System.in);

        // Data Collection
        System.out.print("Enter total number of slices of pizza : ");
        int totalSlices = scnr.nextInt();
        System.out.print("Enter the number of people : ");
        int numberOfPeople = scnr.nextInt();

        // Processing
        int slicesLeftOver = totalSlices % numberOfPeople;
        int slicesPerPerson = (totalSlices - slicesLeftOver) / numberOfPeople;
        
        // Outputs
        System.out.println("\nNumber of slices each person will get : " + slicesPerPerson);
        System.out.println("Number of slices left over : " + slicesLeftOver);
        
    }    
}

// Test Cases
    // Test Case 1 : 33 slices, 7 people -> Output: 4 slices each, 5 slices left over 