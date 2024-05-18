package Individual_Assignments.Chapter8;

import java.util.Scanner;

public class countUpTo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What number should I count up from : ");
        int start = scan.nextInt();
        System.out.print("What number should I count up to   : ");
        int end = scan.nextInt();

        System.out.print("\nOutput : ");
        for(int i = start; i <= end; i++){
            System.out.printf("%d, ", i);
        }
    }
}