//package 12.3.Examples.Challenge_Activity;

/*
 * 
 * Variables fileByteStream and gradeFS are FileInputStream and Scanner, respectively. String dataFileName is assigned a file's name read from input. Perform the following tasks:
        1. Assign fileByteStream with a FileInputStream that opens the file dataFileName for reading.
        2. Assign gradeFS with a Scanner created using fileByteStream.
 * 
 * 
 */

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class GradeDataProcessor {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      String dataFileName;
      char gradeGrade;
      FileInputStream fileByteStream = null;
      Scanner gradeFS = null;

      // Read the file name from the standard input
      System.out.println("Enter the file name:");
      dataFileName = scnr.next();

      // Task 1: Assign fileByteStream with a FileInputStream that opens the file dataFileName for reading
      fileByteStream = new FileInputStream(dataFileName);

      // Task 2: Assign gradeFS with a Scanner created using fileByteStream
      gradeFS = new Scanner(fileByteStream);

      gradeGrade = gradeFS.next().charAt(0);
      System.out.println(gradeGrade);

      fileByteStream.close();
   }
}