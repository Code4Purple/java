/**
 * 
 * String dataFileName is assigned a file's name read from input. The file is opened as a FileInputStream 
    named fByteStream, and Scanner dataFS may be used to read the file. Perform the following tasks:

    1. Assign gradeGrade with the first character read from the file.
    2. Output the value of gradeGrade followed by a newline.
    3. Close the file.

 * 
 * 
 */

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReader {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      String dataFileName;
      char gradeGrade;
      FileInputStream fByteStream = null;
      Scanner dataFS = null;

      dataFileName = scnr.next();

      fByteStream = new FileInputStream(dataFileName);
      dataFS = new Scanner(fByteStream);

      /* Your code goes here */
      gradeGrade  = dataFS.next().charAt(0);
      System.out.println(gradeGrade);
      fByteStream.close();

      // Attempt to access the file for testing purpose
      fByteStream.read();
   }
}