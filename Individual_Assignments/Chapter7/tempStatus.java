package Individual_Assignments.Chapter7;

import java.util.Scanner;

public class tempStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first temperature  : ");
        int temp1 = input.nextInt();
        System.out.print("Enter second temperature : ");
        int temp2 = input.nextInt();
        System.out.print("Enter third temperature  : ");
        int temp3 = input.nextInt();
        System.out.print("Enter fourth temperature : ");
        int temp4 = input.nextInt();

        //System.out.println("");
        double min = Math.min(temp1, Math.min(temp2, Math.min(temp3, temp4)));
        System.out.println("\nMin     : " + min);
        double max = Math.max(temp1, Math.max(temp2, Math.max(temp3, temp4)));
        System.out.println("Max     : " + max);
        double average = (temp1 + temp2 + temp3 + temp4) / 4;
        System.out.println("Average : " + average);
        double range = max - min;
        double midPoint = max - (range / 2);
        double skew = (average - midPoint) / range * 100;
        System.out.printf("Skew    : %.1f%%\n", skew);
        System.out.println("Range   : " + range);

    }     
}
