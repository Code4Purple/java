/*
Integer cabinetCount and string friendName are read from input. A FileOutputStream named fileStream is declared and the file 
named output.txt is opened. Then, a PrintWriter named fileWriter is declared and associated with the file. Write the following 
to the opened file:

    "Pick up:"
    "+ + +"
    cabinetCount, followed by " cabinets for " and friendName
    Another "+ + +"

End each output with a newline. Finally, close the file.

Ex: If the input is 18 Yuto, then output.txt contains:

Pick up:
+ + +
18 cabinets for Yuto
+ + +

Note: Data written to a file may be lost if the file is not closed.

*/

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      FileOutputStream fileStream = null;
      PrintWriter fileWriter = null;
      int cabinetCount;
      String friendName;

      cabinetCount = scnr.nextInt();
      friendName = scnr.next();
  
      fileStream = new FileOutputStream("output.txt");
      fileWriter = new PrintWriter(fileStream);

      fileWriter.println("Pick up:");
      fileWriter.println("+ + +");
      fileWriter.printf("%d cabinets for %s\n",cabinetCount,friendName);
      fileWriter.println("+ + +");
      fileWriter.close();

   }
}
