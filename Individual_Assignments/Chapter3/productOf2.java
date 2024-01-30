// File: productOf2.java
// Name: Bennie Kowalski
// Date: 01/29/2023
// Assignment: 3.20 Individual Assignment

package Individual_Assignments.Chapter3;

import java.util.Scanner;

public class productOf2 {
    public static void main(String[] args) {
        //declare and instantiate a Scanner object to collect user input
        Scanner scnr = new Scanner(System.in);
        
        // Collect the first number from the user.
        System.out.print("Enter first number  : ");
        int firstNumber = scnr.nextInt();
        // Collect the second number from the user.
        System.out.print("Enter second number : ");
        int secondNumber = scnr.nextInt();
        
        // Calculate the sum of the two numbers.
        int total = firstNumber * secondNumber;
        // Display the sum of the two numbers.
        System.out.println("The product is : " + total);

    }
}
