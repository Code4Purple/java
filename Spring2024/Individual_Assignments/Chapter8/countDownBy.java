package Individual_Assignments.Chapter8;
import java.util.Scanner;
public class countDownBy {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("What number should I count down from : ");
        int start = scan.nextInt();
        System.out.print("What number should I count down to   : ");
        int end = scan.nextInt();
        System.out.print("What number should I count down by   : ");
        int by = scan.nextInt();
        
        
        System.out.print("\nOutput : ");
        for(int i = start; i >= end; i-=by){
            System.out.printf("%d, ", i);
        }
    }
}
