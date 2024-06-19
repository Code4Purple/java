import java.util.Scanner; // import the Scanner class
//import java.util.ArrayList; // import the ArrayList class

public class workStation {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numElems;
      int[] userPoints;
      int i;

      numElems = scnr.nextInt();

      userPoints = new int[numElems];
      
      for(int j = 0; j < numElems; j++){;
         if(j == numElems - 2){
            userPoints[j] = 50;
         }
         else{
            userPoints[j] = 0;
         }
         
      }

      System.out.print("Updated points: ");
		for (i = 0; i < userPoints.length; ++i) {
			System.out.print(userPoints[i] + " ");
		}
		System.out.println();
   }
}