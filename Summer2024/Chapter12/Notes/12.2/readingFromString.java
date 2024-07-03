/* 		 				12.2.2: Reading from a string. 

Problem to solve : Write code that uses the input string stream inSS to read input data from string userInput, and updates 
variables userMonth, userDate, and userYear. Sample output if the input is "Jan 12 1992":

Month: Jan
Date: 12
Year: 1992


 */


import java.util.Scanner;

public class readingFromString {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      Scanner inSS = null;
      String userInput;
      String userMonth;
      int userDate;
      int userYear;

      userInput = scnr.nextLine();
      inSS = new Scanner(userInput);
      
      String[] parts = userInput.split(" ");
      userMonth = parts[0];
      userDate = Integer.parseInt(parts[1]);
      userYear = Integer.parseInt(parts[2]);
      

      System.out.println("Month: " + userMonth);
      System.out.println("Date: " + userDate);
      System.out.println("Year: " + userYear);
	
      scnr.close();
      inSS.close();
   }
}
