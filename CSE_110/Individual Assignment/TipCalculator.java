import java.util.Scanner;
public class TipCalculator {
   public static void main(String[] args) {
      // Below this comment: declare and instantiate a Scanner
         Scanner scan = new Scanner(System.in);
        
      // Below this comment: declare any variables you may need
         double check;
         double tip10;
         double tip15;
         double tip20;
         double tip25;
         double tip30;

      // Below this comment: collect the requried inputs from the user
         System.out.print("Enter the your total check amount : ");
         check = scan.nextDouble();
      // Below this comment: compute and store the required output values
         tip10 = check * 0.10;
         tip15 = check * 0.15;
         tip20 = check * 0.20;
         tip25 = check * 0.25;
         tip30 = check * 0.30;
         
         double total10 = check + tip10;
         double total15 = check + tip15;
         double total20 = check + tip20;
         double total25 = check + tip25;
         double total30 = check + tip30;
         
      // Below this comment: disply the required results
         System.out.printf("Total with 10%% tip ($%.2f) is $%.2f\n",tip10, total10);
         System.out.printf("Total with 15%% tip ($%.2f) is $%.2f\n",tip15, total15);
         System.out.printf("Total with 20%% tip ($%.2f) is $%.2f\n",tip20, total20);
         System.out.printf("Total with 25%% tip ($%.2f) is $%.2f\n",tip25, total25);
         System.out.printf("Total with 30%% tip ($%.2f) is $%.2f\n",tip30, total30);
   }
}