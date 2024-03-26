package Labs;

import java.util.Scanner;

public class RosieRoadCo {
    public static void main(String[] args) {
        // inputs
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Road Project Length in Miles : ");
        double miles =2.75; //scan.nextDouble();
        System.out.print("Enter Number of Lanes              : ");
        int lanes = 3;//scan.nextInt();
        System.out.print("Enter Depth of Asphalt in Inches   : ");
        int inches = 12;//scan.nextInt();
        System.out.print("Enter Days to Complete Project     : ");
        int days = 30; //scan.nextInt();

        // outputs
        String title_AMN = "== Amount of Materials Needed ===";
        String title_Cost = "=== Cost of Materials ============";
        String title_TotalCost = "=== Total Cost of Project ========";

        System.out.printf("%s\n",title_AMN);
        System.out.printf("Truckloads of Asphalt : %d\n", truckloadsOfAsphalt(miles, lanes, inches));
        System.out.printf("Stoplights            : %d\n", numberOfStoplights(miles, lanes));
        System.out.printf("Water Pipes           : %d\n", numberOfWaterPipes(miles));
        System.out.printf("Power Pipes           : %d\n", numberOfPowerPipes(miles));
        System.out.printf("Crew members needed   : %d\n", numberOfCrewMembers(miles, lanes, days));
        System.out.printf("%s\n",title_Cost);
        System.out.printf("Cost of Asphalt        : $%.2f\n", );
        System.out.printf("Cost of Stoplights     : $%.2f\n", numberOfStoplights(miles, lanes) * 32000.0);
        System.out.printf("Cost of Water Pipes    : $%.2f\n", numberOfWaterPipes(miles) * 280.0);
        System.out.printf("Cost of Power Pipes    : $%.2f\n", numberOfPowerPipes(miles) * 350.0);
        System.out.printf("Cost of Crew members   : $%.2f\n", numberOfCrewMembers(miles, lanes, days) * (days * 8 * 24.0));
        System.out.printf("%s\n",title_TotalCost);
        double totalCost = truckloadsOfAsphalt(miles, lanes, inches) * 250 + numberOfStoplights(miles, lanes) * 32000 + numberOfWaterPipes(miles) * 280 + numberOfPowerPipes(miles) * 350 + numberOfCrewMembers(miles, lanes, days) * 24 * days;
        System.out.printf("Total Cost of Project  : $%.2f\n", totalCost);


    }

    public static int numberOfStoplights(double miles, int lanes){
        int intersections = (int)(Math.floor(miles));
        int stopLights = intersections * (2 + lanes);
        return stopLights;
    }
    public static int truckloadsOfAsphalt(double miles, int lanes, int inches){
        double roadLength = miles * 5280; // Mile to feet
        double roadWidth = lanes * 12; // CONVERT LANES TO FEET
        double roadDepth = inches / 12.0; // CONVERT INCHES TO FEET
        double cubicFeet = roadLength * roadWidth * roadDepth;
        //System.out.printf("Length = %.2f, Width = %.2f, Depth = %.2f, Cubic Feet = %.2f\n", roadLength, roadWidth, roadDepth, cubicFeet); // Debugging
        double asphaltPounds = cubicFeet * 150; //  asphalt weighs 150 pounds per cubic foot
        int approximateTruckLoads = (int)Math.ceil(asphaltPounds / 10000); // 1 truckload = 10,000 pounds
        return approximateTruckLoads;
    }

    public static int numberOfPowerPipes(double miles){
       double feet = miles * 5280;
       int approximatePowerPipes =  (int)Math.ceil(feet / 20);
       return approximatePowerPipes;
    }
    public static int numberOfWaterPipes(double miles){
       double feet = miles * 5280;
       int approximateWaterPipes =  (int)Math.ceil(feet / 15);
       return approximateWaterPipes;
    }
    public static int numberOfCrewMembers(double miles, int lanes, int days){
        double crew = (50 * miles * lanes) / days;
        return (int)Math.ceil(crew);
    }
    
}



//Test Case
/*System.out.println(numberOfStopLights(1.0,  1));  //should return the value 3
System.out.println(numberOfStopLights(1.0,  2));  //should return the value 4
System.out.println(numberOfStopLights(2.0,  1));  //should return the value 6
System.out.println(numberOfStopLights(2.75,  3)); //should return the value 10 */

/*int numberOfStopLights = numberOfStoplights(1.0,  1);
System.out.println(numberOfStopLights); */

/*System.out.println(truckloadsOfAsphalt(1.0, 1, 12));     //should return the value 951
System.out.println(truckloadsOfAsphalt(1.0, 2, 12));     //should return the value 1901
System.out.println(truckloadsOfAsphalt(2.0, 1, 24));     //should return the value 3802
System.out.println(truckloadsOfAsphalt(2.75, 3, 10));    //should return the value 6534 */

/*System.out.println(numberOfPowerPipes(1.0));   // should return the value 264
System.out.println(numberOfPowerPipes(1.5));  // should return the value 396
System.out.println(numberOfPowerPipes(2.0));  // should return the value 528
System.out.println(numberOfPowerPipes(2.75)); // should return the value 726*/

/*System.out.println(numberOfWaterPipes(1.0)); //should return the value 352
System.out.println(numberOfWaterPipes(1.5)); //should return the value 528
System.out.println(numberOfWaterPipes(2.0)); //should return the value 704
System.out.println(numberOfWaterPipes(2.75)); //should return the value 968 */

//System.out.println(numberOfCrewMembers(1.0, 1, 12)); // should return the value 5
//System.out.println(numberOfCrewMembers(1.0, 2, 15)); // should return the value 7
//System.out.println(numberOfCrewMembers(2.0, 1, 20)); // should return the value 5
//System.out.println(numberOfCrewMembers(2.75, 3, 10)); // should return the value 42

