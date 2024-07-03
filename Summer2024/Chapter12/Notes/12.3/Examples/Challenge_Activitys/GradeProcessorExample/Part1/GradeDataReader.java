import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class GradeDataReader {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      String gradeFileName;
      char gradeGrade;
      FileInputStream fileByteStream = null;
      Scanner inFS = null;

      gradeFileName = scnr.next();

      fileByteStream = new FileInputStream(gradeFileName);
      inFS = new Scanner(fileByteStream);

      gradeGrade = inFS.next().charAt(0);
      System.out.println(gradeGrade);

      fileByteStream.close();
   }
}