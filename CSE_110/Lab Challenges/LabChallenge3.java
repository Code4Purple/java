// Lab 03 -  Truckloads of Asphalt

//import java.util.Scanner;

public class LabChallenge3 {
    public static void main(String[] args){
        // Scanner 
        //Scanner scan = new Scanner(System.in);
        
        // declared Variable
        double miles;
        int numOfLanes;
        int depthOfAsphalt;
        int truckLoads;
        double cost;
        
        // Input 
        /*System.out.print("Enter length of road in miles    : ");
        miles = scan.nextDouble();
        System.out.print("Enter number of lanes            : ");
        numOfLanes = scan.nextInt();
        System.out.print("Enter depth of asphalt in inches : ");
        depthOfAsphalt = scan.nextInt(); */

        // Testing Values
        miles = 1;
        numOfLanes = 2;
        depthOfAsphalt = 12;

        // Processes
        double length_feet = miles * 5280;                              // Miles to Feet
        int width_feet = numOfLanes * 12;                               // Lanes width in feet
        int depth_Feet = (int)(Math.ceil(depthOfAsphalt / 12.0));             // Depth in feet
        double cubic_feet =  length_feet * width_feet * depth_Feet;     // Getting Cubic Feet - Total
        double pounds = cubic_feet * 145 ;                               // how many pounds we need 
        double tons = pounds / 2000;                                    // Getting pounds to tons
        truckLoads = (int)(Math.ceil(tons / 5));                        // How many Truck-Loads we need
        cost = truckLoads * 150 * 5;
        // Output
        System.out.println(length_feet);
        System.out.println(width_feet);
        System.out.println(depth_Feet);
        System.out.println(cubic_feet);
        System.out.println(pounds);
        System.out.println(tons);
        System.out.println("");
        System.out.println("Truckloads of asphalt needed is : " + truckLoads);
        System.out.printf("Total cost of asphalt is        : $%.2f", cost);
    } 
}
