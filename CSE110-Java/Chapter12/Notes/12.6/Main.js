import java.io.FileOutputStream;
import java.io.PrintWriter ;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
      FileOutputStream myFile = new FileOutputStream("output_data.txt");
    	PrintWriter myFileWriter = new PrintWriter(myFile);
        
      myFileWriter.println("Hello, this is my file output.");
      myFileWriter.println("Here is a computer haiku:");
      myFileWriter.println("\tYesterday it worked.");
		  myFileWriter.println("\tToday it is not working.");
		  myFileWriter.println("\tWindows is like that.");
      myFileWriter.println("Haiku have " + 3 + " lines.");
      myFileWriter.close();
      System.out.println("Output complete!");
    }
}
