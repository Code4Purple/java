// File : Circle.java
// Name : Bennie Kowalski
// Date : Jan 27, 2024
// Assignment Name : Lab 01 - Properties of a Circle
// Discription : This program will calculate the properties of a circle

package Labs;

import java.util.Scanner;

class Circle {
    public static void main(String[] args) {
        // All the Declarations
        double radius;
        double diameter;
        double circumference;
        double area;
        double semiCircleArea;

        final double pi = 3.1415;

        // Create a Scanner object for input
        Scanner scan = new Scanner(System.in);

        // Input
        System.out.print("Enter the radius of a circle: "); // Input Test: 10.25
        radius = scan.nextDouble();

        // Processing
        diameter = radius * 2;
        circumference = pi * diameter;
        area = pi * (radius * radius);
        semiCircleArea = area / 2;
        
        // Output
        System.out.println("Properties of a Circle");
        System.out.println("Radius             : " + radius);
        System.out.println("Diameter           : " + diameter);
        System.out.println("Circumference      : " + circumference);
        System.out.println("Area               : " + area);
        System.out.println("Area of Semicircle : " + semiCircleArea);
        System.out.println(); // Breaking for console

        System.out.println("Properties \"Rounded\" Down");
        System.out.printf("Radius             : %.0f\n", radius);
        System.out.println("Diameter           : " + (int)diameter);
        System.out.printf("Circumference      : %.0f\n", circumference);
        System.out.printf("Area               : %.0f\n", area);
        System.out.printf("Area of Semicircle : %.0f\n", semiCircleArea);

       /* Test Output:
        
        Properties of a Circle
        Radius             : 10.25
        Diameter           : 20.5
        Circumference      : 64.40075
        Area               : 330.05384375
        Area of Semicircle : 165.026921875

        Properties "Rounded" Down
        Radius             : 10
        Diameter           : 20
        Circumference      : 64
        Area               : 330
        Area of Semicircle : 165
        
        */
    }
}
