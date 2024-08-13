//package Chapter13.Notes.13.19;

import java.util.Scanner;

public class CallAirplane {
    public static void main(String[] args) {
       Airplane boeing747 = new Airplane();

       Scanner input = new Scanner(System.in);
       System.out.print("Enter the altitude: ");
       int altitude = input.nextInt();


       boeing747.setAltitude(altitude);
       boeing747.print();
    }
}