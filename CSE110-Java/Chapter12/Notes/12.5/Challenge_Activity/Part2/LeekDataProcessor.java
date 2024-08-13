/*
Variables outStream and dataFS are FileOutputStream and PrintWriter, respectively. String nameOfFile is assigned a file's name 
read from input. Perform the following tasks:

    Assign outStream with a new FileOutputStream that opens nameOfFile for writing.
    Assign dataFS with a new PrintWriter created using outStream.

Ex: If the input is output.txt 27.5, then output.txt contains:
27.5 kilograms of leeks

*/

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class LeekDataProcessor {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      String nameOfFile;
      double leekWeight;
      FileOutputStream outStream = null;
      PrintWriter dataFS = null;      

      nameOfFile = scnr.next();
      
      // Task 1
      outStream = new FileOutputStream(nameOfFile);
      // Task 2
      dataFS = new PrintWriter(outStream);

      leekWeight = scnr.nextDouble();

      dataFS.println(leekWeight + " kilograms of leeks");
      dataFS.close();
   }
}
