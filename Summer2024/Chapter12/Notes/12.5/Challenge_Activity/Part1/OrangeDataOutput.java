import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class OrangeDataOutput {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      String orangeDataName;
      double orangeWeight;
      // Task 1
      FileOutputStream orangeFStream = null;
      // Task 2
      PrintWriter orangeOutFS = null;

      orangeDataName = scnr.next();
      orangeFStream = new FileOutputStream(orangeDataName);
      orangeOutFS = new PrintWriter(orangeFStream);

      orangeWeight = scnr.nextDouble();

      orangeOutFS.println(orangeWeight + " kilograms of oranges");
      orangeOutFS.close();
   }
}
