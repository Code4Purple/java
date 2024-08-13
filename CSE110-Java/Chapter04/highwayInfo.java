//  Lab 04 - Interstate Highway

package Labs;

import java.util.Scanner;

public class highwayInfo {
    public static void main (String[] args) {
        // declare variables
        Scanner sncr = new Scanner(System.in);
        int highway = 0;
        String output = "";
        
        //input
        System.out.print("Enter the highway number: ");
        highway = sncr.nextInt();

        //process
        output = "The " + highway + " is " ;

        if (highway > 99){
            int primary = highway % 100;
            output += "auxiliary, serving the " + primary;
        }
        else {
            output += "primary";
        }

        if ((highway % 2) == 0){
            output += ", going east/west.";
        }
        else {
            output += ", going north/south.";
        }
        
        // output        
        System.out.println(output);
    }
}
