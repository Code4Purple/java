package Individual_Assignments.Chapter8;

import java.util.Scanner;
public class countDivisibleByXorY {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer      : ");
        int x = scan.nextInt();
        System.out.print("Enter another integer : ");
        int y = scan.nextInt();

        int count = 0;
        for(int i = 1; i <= 100; i++){
            if(i % x == 0 || i % y == 0){
                count++;
            }
        }
        System.out.printf("\nBetween 1 and 100, there are %d integers that are evenly divisible by either %d or %d.",count,x,y);
    }
}
