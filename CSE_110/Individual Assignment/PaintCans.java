// Painting a Wall - Lab

import java.util.Scanner;

class PaintCans {
    public static void main (String[] args){
        // Defines
        Scanner sncr = new Scanner(System.in);

        // Inputs
        System.out.println("Enter wall height (feet) : ");
        int wallHeight = sncr.nextInt();
        System.out.println("Enter wall width (feet) : ");
        int wallWidth = sncr.nextInt();
        System.out.println(""); // Spaceing

        // Processes
        int wallArea = wallHeight * wallWidth;
        double onePaintedWall = 350;
        double paintGallon =  wallArea / onePaintedWall;
        double paintCans = Math.ceil(paintGallon);
        
        // Outputs
        System.out.printf("Wall area : %d\n", wallArea);
        System.out.printf("Paint needed : %.2f\n", paintGallon);
        System.out.printf("Cans needed : %.0f can(s)\n", paintCans);




    }
}
