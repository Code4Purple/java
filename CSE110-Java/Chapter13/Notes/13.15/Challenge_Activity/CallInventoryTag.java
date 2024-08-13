//package Chapter13.Notes.13.15.Challenge_Activity;

import java.util.Scanner;

public class CallInventoryTag {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      InventoryTag redSweater = new InventoryTag();
      int sweaterShipment;
      int sweaterInventoryBefore;

      sweaterInventoryBefore = redSweater.getQuantityRemaining();
      sweaterShipment = 5;

      System.out.println("Beginning tests.");

      // FIXME add unit test for addInventory
      redSweater.addInventory(sweaterShipment);
      if(redSweater.getQuantityRemaining() != 25){
         System.out.println("   UNIT TEST FAILED: addInventory()");
      }

      System.out.println("Tests complete.");
   }
}

