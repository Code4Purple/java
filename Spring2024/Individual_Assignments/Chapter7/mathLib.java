package Individual_Assignments.Chapter7;

import java.util.Scanner;

public class mathLib {
    public static void main(String[] args) {
        
        int num1, num2;
        double num3;
        String noun;
        String properName;
        String verb;
        String adjective1;
        String adjective2; 

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a whole number : ");
        num1 = input.nextInt();
        System.out.print("Enter another whole number : ");
        num2 = input.nextInt();
        System.out.print("Enter any number : ");
        num3 = input.nextDouble();
        System.out.print("Enter a noun : ");
        noun = input.next();
        System.out.print("Enter a proper name : ");
        properName = input.next();
        properName = properName + " " + input.next(); 
        System.out.print("Enter a verb : ");
        verb = input.next();
        System.out.print("Enter an adjective : ");
        adjective1 = input.next();
        System.out.print("Enter another adjective : ");
        adjective2 = input.next();

       /* String output = "One day, ";
        output += num1 + " ";
        output += noun + "(s) ";
        output += "wanted to cross a bridge over a river. Under that bridge lived a(n) ";
        output += adjective1 + " Troll weighing "; 
        //System.out.println(output);
        //System.out.print(num3);
        output += num3 + " pounds, with " + num2 + " eyes and " + adjective2 + " hair, " + "named " + properName + ". ";
        output += properName + " said to the " + noun + "(s) " + "\"" + verb + " away, or I will have to eat you!\".";
        System.out.println(output); 
        System.out.println(); */

        System.out.printf("One day, %d %s(s) wanted to cross a bridge over a river. Under that bridge lived a(n) %s Troll weighing %.2f pounds, with %d eyes and %s hair, named %s. %s said to the %s(s) \"%s away, or I will have to eat you!\".", num1, noun, adjective1, num3, num2, adjective2, properName, properName, noun, verb);

    }
}
