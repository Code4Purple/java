package Individual_Assignments.Chapter8;

import java.util.Scanner;
public class countDown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to count down from: ");
        int num = input.nextInt();
        System.out.println("Counting down from " + num + " to 1: ");
        for(int i = 0; num > i; num--){
            System.out.printf("%d",num);
        }
    }
}
