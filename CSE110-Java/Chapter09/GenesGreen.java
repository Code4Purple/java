package Individual_Assignments.Chapter9;

import java.util.Scanner;
public class GenesGreen {
    public static void main(String[] args) {
        /* System.out.println(areaOfRectangle(3.0, 5.0)); // should return the value 15.0
        System.out.println(areaOfRectangle(8.0, 3.0)); // should return the value 24.0
        System.out.println(areaOfRectangle(7.5, 5.5)); // should return the value 41.25 */

        /* System.out.println(areaOfCircle(10.0)); // should return the approximate value 78.54
        System.out.println(areaOfCircle(15.0)); // should return the approximate value 176.71
        System.out.println(areaOfCircle(20.0)); // should return the approximate value 314.15 */

        /* System.out.println(perimeterOfRectangle(3.0, 5.0)); // should return the value 16.0
        System.out.println(perimeterOfRectangle(8.0, 3.0)); // should return the value 22.0
        System.out.println(perimeterOfRectangle(7.5, 5.5)); // should return the value 26.0 */

        /* System.out.println(perimeterOfCircle(3.0)); // should return the approximate value 9.42
        System.out.println(perimeterOfCircle(8.0)); // should return the approximate value 25.13
        System.out.println(perimeterOfCircle(7.5)); // should return the approximate value 23.56 */

        /*System.out.println(areaOfTee(3.0)); // should return the approximate value 0.79
        System.out.println(areaOfTee(8.0)); // should return the approximate value 5.59
        System.out.println(areaOfTee(7.5)); // should return the approximate value 4.91 */

        /* System.out.println(areaOfPuttingGreen(3.0)); // should return the approximate value 3.14
        System.out.println(areaOfPuttingGreen(8.0)); // should return the approximate value 22.34
        System.out.println(areaOfPuttingGreen(7.5)); // should return the approximate value 19.63 */

        /* System.out.println(areaOfSandTrap(3.0)); // should return the approximate value 0.44
        System.out.println(areaOfSandTrap(8.0)); // should return the approximate value 3.14
        System.out.println(areaOfSandTrap(7.5)); // should return the approximate value 2.76 */

        /* System.out.println(numberOfBushes(10.0, 20.0)); // should return the value 58
        System.out.println(numberOfBushes(10.5, 5.25)); // should return the value 29
        System.out.println(numberOfBushes(20.0, 10.0)); // should return the value 58 */

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Course Length : ");
        int length = scan.nextInt();
        System.out.print("Enter Course Width  : ");
        int width = scan.nextInt();
        volumeOfSod(length, width);

    }

    public static double areaOfRectangle(double length, double width) {
        double area = length * width;
        return area;
    }
    
    public static double areaOfCircle(double radius) {
        double PI = 3.1415;
        double area = PI * (Math.pow(radius, 2.0)) * (1/4.0);
        return area;
    }

    public static double perimeterOfRectangle(double length, double width) {
        double perimeter = length + length + width + width;
        return perimeter;
    }

    public static double perimeterOfCircle(double diameter) {
        double PI = 3.1415;
        double perimeter = PI * diameter;
        return perimeter;
    }

    public static double areaOfTee(double width){
        double diameter = width * 1/3.0;
        return areaOfCircle(diameter);
    }

    public static double areaOfPuttingGreen(double radius){
        double area = areaOfCircle(radius * (2/3.0));
        //System.out.printf("%.2f - %.2f = " , area, area2 );
        return area;
    }

    public static double areaOfSandTrap(double radius){
        double area = areaOfCircle(radius * (1/4.0));
        return area;
    }

    public static int numberOfBushes(double length, double width){
        double perimeterOfRectangle = perimeterOfRectangle(length, width);
        int numberOfBushes = (int) (perimeterOfRectangle - 2);
        return numberOfBushes;
    }

    public static void volumeOfSod(double length, double width){
        String roughSod =    "Total square yards of rough sod  :";
        double totalRS = length * width;
        totalRS -= areaOfTee(width);
        totalRS -= areaOfPuttingGreen(width);
        totalRS -= areaOfSandTrap(width);
        totalRS = Math.ceil(totalRS);
        
        String smoothSod =   "Total square yards of smooth sod :";
        double totalSS = Math.ceil(areaOfTee(width) + areaOfPuttingGreen(width));
        
        String tonsOfSand =  "Tons of sand                     :";
        double totalSand = areaOfSandTrap(totalSS) + areaOfSandTrap(totalRS);
        totalSand *= 9;
        totalSand /= 80;
        totalSand /= 2000;
        totalSand *= totalSS;
        totalSand = Math.ceil(totalSand);

        String numOfBushes = "Number of bushes                 :";
        double bushes = numberOfBushes(length, width);

        System.out.printf("\n%s %.0f\n", roughSod, totalRS);
        System.out.printf("%s %.0f\n", smoothSod, totalSS);
        System.out.printf("%s %.2f\n", tonsOfSand, totalSand);
        System.out.printf("%s %.0f\n", numOfBushes, bushes);

    }
}
