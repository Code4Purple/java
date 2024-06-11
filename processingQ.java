import java.util.Scanner;
public class processingQ {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userAge;

      userAge = scnr.nextInt();

      while (userAge < 16 || userAge > 70) {
         if (userAge < 16) {
            System.out.println("5% discount");
         }
         else {
            System.out.println("15% discount");
         }
         userAge = scnr.nextInt();
      }

      System.out.print("No discount");
        
    }
}