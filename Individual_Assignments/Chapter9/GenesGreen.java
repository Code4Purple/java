package Individual_Assignments.Chapter9;

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

        System.out.println(areaOfPuttingGreen(3.0)); // should return the approximate value 3.14
        System.out.println(areaOfPuttingGreen(8.0)); // should return the approximate value 22.34
        System.out.println(areaOfPuttingGreen(7.5)); // should return the approximate value 19.63

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
}
