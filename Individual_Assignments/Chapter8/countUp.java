package Individual_Assignments.Chapter8;
import java.util.Scanner;
public class countUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to count up to: ");
        int num = input.nextInt();
        System.out.print("Counting up from 1 to " + num + ": ");
        for(int i = 1; i <= num; i++){
            System.out.printf("%d ",i);
        }
    }
}
