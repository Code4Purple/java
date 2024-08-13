// File: averageOf3.java
// Name: Bennie Kowalski
// Date: 01/29/2023
// Assignment: 3.22 Individual Assignment

package Individual_Assignments.Chapter3;

import java.util.Scanner;

public class averageOf3 {
    public static void main(String[] args) {
        // declare and instantiate a Scanner object to collect user input
        Scanner scnr = new Scanner(System.in);
        
        // Collect the first number from the user.
        System.out.print("Enter first number  : ");
        int firstNumber = scnr.nextInt();
        // Collect the second number from the user.
        System.out.print("Enter second number : ");
        int secondNumber = scnr.nextInt();
        // Collect the third number from the user.
        System.out.print("Enter third number  : ");
        int thirdNumber = scnr.nextInt();
        
        // Calculate the sum of the two numbers.
        int total = firstNumber + secondNumber + thirdNumber;
        // Calculate the average of the two numbers.
        int average = total / 3;
        // Display the sum of the two numbers.
        System.out.println("The average is : " + average);
    }    
}
