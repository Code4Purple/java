package Labs;

public class RosieRoadCo {
    public static void main(String[] args) {
        
                                   //Test Cases  
        /*System.out.println(numberOfStopLights(1.0,  1));  //should return the value 3
        System.out.println(numberOfStopLights(1.0,  2));  //should return the value 4
        System.out.println(numberOfStopLights(2.0,  1));  //should return the value 6
        System.out.println(numberOfStopLights(2.75,  3)); //should return the value 10 */

        /*int numberOfStopLights = numberOfStoplights(1.0,  1);
        System.out.println(numberOfStopLights); */

        System.out.println(truckloadsOfAsphalt(1.0, 1, 12));     //should return the value 951
        System.out.println(truckloadsOfAsphalt(1.0, 2, 12));     //should return the value 1901
        System.out.println(truckloadsOfAsphalt(2.0, 1, 24));     //should return the value 3802
        System.out.println(truckloadsOfAsphalt(2.75, 3, 10));    //should return the value 6534
        
    }

    public static int numberOfStoplights(double miles, int lanes){
        int intersections = (int)(Math.floor(miles));
        int stopLights = intersections * (2 + lanes);
        return stopLights;
    }
    public static int truckloadsOfAsphalt(double miles, int lanes, int inches){
        double roadLength = miles * 5280;
        double roadWidth = lanes * 12;
        double roadDepth = inches / 12.0;
        double cubicFeet = roadLength * roadWidth * roadDepth;
        //System.out.printf("Length = %.2f, Width = %.2f, Depth = %.2f, Cubic Feet = %.2f\n", roadLength, roadWidth, roadDepth, cubicFeet);
        double asphaltPounds = cubicFeet * 150; //  asphalt weighs 150 pounds per cubic foot
        int approximateTruckLoads = (int)Math.ceil(asphaltPounds / 10000); // 1 truckload = 10,000 pounds
        return approximateTruckLoads;
    }
}

// Lab P @ 18:00 mins
