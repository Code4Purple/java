package Individual_Assignments.Chapter7;

import java.util.Scanner;
public class powerWaterCost {
    public static void main(String[] args) {
        /* 
            Power conduit pipes come only in 12 ft lengths
            Water conduit pipes come only in 24 ft lengths
            Each power conduit pipe length costs $220
            Each water conduit pipe length costs $415
            Power and water pipes must be purchased in whole lengths (you cannot buy half a pipe)
            A single continuous line of power conduit must run under the entire length of the road
            A single continuous line of water conduit must run under the entire length of the road

            A mile is 5280 feet
        */

        double miles;
        double powerPipes;
        double waterPipes;
        double powerCost;
        double waterCost;
        double totalCost;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of miles of road : ");
        miles = input.nextDouble();

        double milesToFeet = miles * 5280; // miles to feet conversion
        waterPipes = Math.ceil(milesToFeet / 24); // water pipes needed
        powerPipes = Math.ceil(milesToFeet / 12); // power pipes needed
        waterCost = waterPipes * 415; // water cost
        powerCost = powerPipes * 220; // power cost
        totalCost = waterCost + powerCost; // total cost

        System.out.printf("\nNumber of power pipes needed : %d\n", (int)powerPipes);
        System.out.printf("Number of water pipes needed : %d\n", (int)waterPipes);
        System.out.printf("Cost of power pipes needed   : $%.2f\n", powerCost);
        System.out.printf("Cost of water pipes needed   : $%.2f\n", waterCost);
        System.out.printf("Total cost of pipes needed   : $%.2f\n", totalCost);

    }
}
