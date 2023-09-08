// Lab 03 -  Truckloads of Asphalt

import java.util.Scanner;

public class LabChallenge3 {
    public static void main(String[] args){
    // Below this comment: declare and instantiate a Scanner
        Scanner scan = new Scanner(System.in);
      
    // Below this comment: declare any variables you may need
        double length = 0.0;
        int lanes = 0;
        int depth = 0;
        int truckLoads = 0;
        double cost = 0;
        // Processing set
        double roadLengthInFeet = 0.0;
        double roadWidthInFeet = 0.0;
        double roadDepthInFeet = 0.0;
        double cubicFeet = 0.0;
        double poundsOfAsphalt = 0.0;
        double tonsOfAsphalt = 0.0;

    // Below this comment: collect the required inputs
        System.out.print("Enter length of road in miles     : ");
        length = scan.nextDouble();
        System.out.print("Enter number of lanes             : ");
        lanes = scan.nextInt();
        System.out.print("Enter depth of asphalt in inches  : ");
        depth = scan.nextInt();
      
    // Below this comment: write Java code to do the computations needed to determine the correct output
        roadLengthInFeet = length * 5200;
        roadWidthInFeet = lanes * 12;
        roadDepthInFeet = depth / 12.0;

        cubicFeet = roadLengthInFeet * roadWidthInFeet * roadDepthInFeet;
        poundsOfAsphalt = cubicFeet * 145;
        tonsOfAsphalt = poundsOfAsphalt / 2000;
        
        truckLoads = (int)Math.ceil(tonsOfAsphalt / 5);
        cost = truckLoads * 5 * 150;
      
    // Below this comment: output the correct output
        System.out.println("");
        System.out.printf("Truckloads of asphalt needed is  :  %d\n", truckLoads);
        System.out.printf("Total cost of asphalt is         : $%.2f\n", cost);
    } 
}
