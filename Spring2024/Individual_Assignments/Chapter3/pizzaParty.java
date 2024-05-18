// File: pizzParty.java
// Name: Bennie Kowalski
// Date: 01/29/2023
// Assignment: 3.23 Individual Assignment

package Individual_Assignments.Chapter3;

import java.util.Scanner;

public class pizzaParty {
    public static void main(String[] args){
        // Input Funtion
        Scanner scnr = new Scanner(System.in);
        
        // Data Collection 
        System.out.print("Number of pizzas purchased : ");
        int pizzasPurchased = scnr.nextInt();
        System.out.print("Number of slices per pizza : ");
        int slicesPerPizza = scnr.nextInt();
        System.out.print("Number of adults           : ");
        int numberOfAdults = scnr.nextInt();
        System.out.print("Number of children         : ");
        int numberOfChildren = scnr.nextInt();

        // Processing
        int totalSlices = pizzasPurchased * slicesPerPizza; // total number of slices
        int slicesForAdults = numberOfAdults * 2; // each adult eats 2 slices
        int slicesForChildren = (totalSlices - slicesForAdults) / numberOfChildren; // each child eats the same number of slices
        int slicesLeft = totalSlices - (slicesForAdults + ( slicesForChildren * numberOfChildren)); // slices left over

        // Output
        System.out.println("Number of slices each child will get is : " + slicesForChildren);
        System.out.println("Number of slices left over is           : " + slicesLeft);
    }
}   
        
        // Test Cases
           // Test Case 1: 1 pizza, 8 slices, 1 adults, 1 children  -> Output: 6 slices each, 0 slices left over
           // Test Case 2: 1 pizza, 7 Slices, 2 adults, 2 childern  -> Output: 1 slice each, 1 slice left over
           // Test Case 3: 2 pizza, 10 slices, 3 adults, 8 children -> Output: 1 slices each, 6 slices left over
