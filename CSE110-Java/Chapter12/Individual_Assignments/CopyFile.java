package Summer2024.Chapter12.Individual_Assignments;

// This program will copy the contents of one file into another file,
// line by line.

// You must complete the `makeCopy` method and fill in the missing pieces described in the code below.
// 1) you must write a loop to iterate while the scanner has a next line.
//    within the loop you must ...
//    2) use the scanner to read the next line from the input file and store it in a String variable.
//    3) use the file writer to write the String to the output file.
// after the loop you must ...
// 4) flush the PrintWriter
// 5) close the PrintWriter

// make no other changes to the code, 

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter ;
import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        makeCopy("original.dat", "copy.dat");
        
        // print out the contents of the copy to 
        // verify that the original was copied correctly
        printFile("copy.dat");
    }
    
    public static void makeCopy(String inputFileName, String outputFileName) throws IOException {
        // open a File with the given inputFileName
        // and instantiate a Scanner object to read the File
        Scanner myFileReader = new Scanner(new FileInputStream(inputFileName));        
        
        // open a File with the given outputFileName
        // and instantiate a PrintWriter object to write to the File
        PrintWriter myFileWriter = new PrintWriter(new FileOutputStream(outputFileName));
        
        // 1) loop while the Scanner has a next line
        while(myFileReader.hasNextLine()){
            // 2) read the next line from the Scanner and store it in a String variable
            String reader = myFileReader.nextLine();
            // 3) write the line to the output file
            myFileWriter.println(reader);
            
        // loop ends
        }
        
        // 4) flush the PrintWriter
        myFileReader.close();
        // 5) close the PrintWriter
        myFileWriter.close();

        //myFileReader.close();
    }
    
    // make no changes to this printFile method
    public static void printFile(String fileName) throws IOException {
       Scanner myFileReader = new Scanner(new FileInputStream(fileName));
         while (myFileReader.hasNextLine()) {
            System.out.println(myFileReader.nextLine());
        }

        myFileReader.close();
    }
}

