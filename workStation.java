import java.util.Scanner; // import the Scanner class
import java.util.ArrayList; // import the ArrayList class

public class workStation {
      public static void printSelectedNumbers(int numCount, int number) {
            //Scanner scnr = new Scanner(System.in);
            int i;
         
            for (i = 0; i < numCount; ++i) {
               if (number >= 9) {
                  System.out.println(number);
               }
            }
          }
          
         public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            ArrayList<Integer> numbers = new ArrayList<Integer>();

            int numCount = 5;
            
            for (int i = 0; i < numCount; i++) {
               System.out.print("Enter a number: ");
               int number = input.nextInt();
               numbers.add(number);
            }
            
            for (int i = 0; i < numbers.size(); i++) {
               printSelectedNumbers(numCount, numbers.get(i));
            }


            

         }
      }
   