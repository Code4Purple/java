package playJava;
import java.util.Scanner;

public class math2 {
    public static void main(String[] args) {
        String fullName;
		int index1;
		int index2;
      
      fullName = "Koharu Rhys Fox";

      /* Your code goes here */
      index1 = fullName.indexOf(' ') + 1;
      index2 = fullName.lastIndexOf(' ');
      
      String output = fullName.substring(index1,index2);
      System.out.println(output + "\n");    

      
      Scanner input = new Scanner(System.in);
      int userNum;
      int finalVal;
   
      finalVal = 0;
      userNum = input.nextInt();

      while (userNum >= 0){
        int test = userNum % 2; 
        
        if(test == 0){
            System.out.println("even");
            userNum-=1;
         }
         else{
            System.out.println("odd");
            finalVal++;
            userNum-=1;
         }
         userNum = input.nextInt();
      }

      System.out.println("Final value is " + finalVal);
      System.out.print("\n");

      int currValue;
      int minValue;

      currValue = input.nextInt();
      minValue = currValue;

      while (currValue > 0) {
         if (currValue < minValue) {
            minValue = currValue;
         }

         currValue = input.nextInt();
      }

      System.out.print("Min value: " + minValue);
      System.out.print("\n");

      int userValue;
      int finalProduct;

      finalProduct = 1;

      userValue = input.nextInt();

      while (userValue > 0) {
         finalProduct = finalProduct * userValue;
         userValue = input.nextInt();
      }

      System.out.print("Product: " + finalProduct);
      System.out.print("\n");

      int currAge;

      currAge = input.nextInt();

      while (currAge < 18 || currAge > 70) {
         if (currAge < 18) {
            System.out.println("5% discount");
         }
         else {
            System.out.println("10% discount");
         }
         currAge = input.nextInt();
      }

      System.out.print("No discount");

    }
}
