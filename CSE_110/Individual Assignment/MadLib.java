import java.util.Scanner;

public class MadLib {
   public static void main(String[] args) {
      // Variables
      int num1;
      int num2;
      double num3;
      String noun;
      String properName;
      String verb;
      String adjective1;
      String adjective2;
      
      // Scanner and Imputs
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a whole number : ");
      num1 = scan.nextInt();
      System.out.print("Enter another whole number : ");
      num2 = scan.nextInt();
      System.out.print("Enter any number : ");
      num3 = scan.nextDouble();
      scan.nextLine(); // Breaking Space for  Types of inputs
      System.out.print("Enter a noun : ");
      noun = scan.next();
      scan.nextLine(); // Breaking Space for  Types of inputs
      System.out.print("Enter proper name : ");
      properName = scan.nextLine();
      System.out.print("Enter a verb : ");
      verb = scan.next();
      System.out.print("Enter an adjective : ");
      adjective1 = scan.next();
      System.out.print("Enter another adjective : ");
      adjective2 = scan.next();
      
      // Outputs
      System.out.printf("One day, %d %s(s) wanted to cross a bridge over a river.", num1, noun);
      System.out.printf(" Under that bridge lived a(n) %s Troll weighing %.2f pounds, with %d eyes and %s hair, named %s.", adjective1, num3, num2, adjective2, properName); 
      System.out.printf(" %s said to the %s(s) \"%s away, or I will have to eat you!\".\n", properName, noun, verb);
   }
}