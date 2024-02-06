package Individual_Assignments.Chapter4_Chapter5;

import java.util.Scanner;


public class tempConversion {
    public static void main(String[] args) {
        // fahrenheit to kelvin

        // input function declaration
        Scanner scnr = new Scanner(System.in);
        // variable declaration
        double kelvin;
        double fahrenheit;
        // inputs
        System.out.print("Enter the temperature in fahrenheit: "); 
        fahrenheit = scnr.nextDouble(); // inpuut 100

        // calculations
        double value1 = fahrenheit - 32;
        double value2 = 5.0 / 9.0;
        double value3 = 273.15;
        kelvin = value1 * value2 + value3;

        // outputs
        System.out.printf("\n%.2f degrees Fahrenheit is %.2f Kelvin\n", fahrenheit, kelvin); // output 244.12

        // kelvin to fahrenheit
        // inputs
        System.out.print("Enter the temperature in Kelvin : ");
        kelvin = scnr.nextDouble(); // input 100
        // Processing
        double value4 = kelvin - 273.15;
        double value5 = 9.0 / 5.0;
        double value6 = 32;
        fahrenheit = value4 * value5 + value6;
        // Output
        System.out.printf("\n%.2f degrees Kelvin is %.2f degrees Fahrenheit\n", kelvin, fahrenheit); // output -279.67
    }
}
