import java.util.Scanner;
 
public class PizzaOrder {
   public static void main(String[] args) {
      // Below this comment: declare and instantiate a Scanner
      Scanner scan = new Scanner(System.in);
     
      // Below this comment: declare any other variables you may need
      int totalPeople; 
      int numOfSlicesPer;
      double numOfPizzas;
      
      // Below this comment: collect the required user inputs
      System.out.print("Enter total number of people : ");
      totalPeople = scan.nextInt();
      System.out.print("Enter the number of slices each person will get : ");
      numOfSlicesPer = scan.nextInt();
   
      // Below this comment: compute the number of pizzas to order and store the value in a variable
      numOfPizzas = Math.ceil((totalPeople * numOfSlicesPer) / 8.0);
      
      // Below this comment: write a Java code to display the number of pizzas to order
      System.out.printf("Number of pizzas to order : %.0f\n", numOfPizzas); 
   }
}
