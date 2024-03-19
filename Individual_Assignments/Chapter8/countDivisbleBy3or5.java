package Individual_Assignments.Chapter8;

import java.util.Scanner;

public class countDivisbleBy3or5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What number should I start with : ");
        int start = scan.nextInt();
        System.out.print("What number should I end with   : ");
        int end = scan.nextInt();

        System.out.print("The following are evenly divisible by 3 or 5 : ");

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
