package Individual_Assignments.Chapter7;

import java.util.Scanner;

public class pizzaOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter total number of people : ");
        int people = input.nextInt();
        System.out.print("Enter the number of slices each person will get : ");
        int slices = input.nextInt();

        double output = Math.ceil((people * slices) / 8.0);
        System.out.println("\nNumber of pizzas to order : " + (int)output);
    }
}