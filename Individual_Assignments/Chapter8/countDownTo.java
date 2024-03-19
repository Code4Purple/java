package Individual_Assignments.Chapter8;

import java.util.Scanner;

public class countDownTo {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("What number should I count down from : ");
        int start = scan.nextInt();
        System.out.print("What number should I count down to   : ");
        int end = scan.nextInt();
        
        
        System.out.print("\nOutput : ");
        for(int i = start; i >= end; i--){
            System.out.printf("%d, ", i);
        }
    }
}
