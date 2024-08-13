package Summer2024.Chapter12.Individual_Assignments;

// This program will open the file named "jabberwocky.txt",
// and display the contents of that file to the console (terminal).

// You must change the code, so that
// the program will open the file named "crocodile.txt",
// and display the contents of that file to the console. 

// make no other changes to the code, 
// and make no changes to any of the provided .txt files.

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

class ReadFile1 {
    public static void main(String[] args) throws IOException {
        // Changed the file name from "jabberwocky.txt" to "crocodile.txt"
        displayFileContents("crocodile.txt"); // <-- this is the only line you should change
    }
    
    // Make no changes to the displayFileContents method below
    public static void displayFileContents(String fileName) throws IOException {
        // declare a FileInputStream variable 
        // and instantiate a FileInputStream object for the file with the given FileName
        FileInputStream myFile = new FileInputStream(fileName);
        // declare a Scanner variable
        // and instantiate a Scanner object attached to the File
        Scanner myFileReader = new Scanner(myFile);
        
        // loop while the Scanner has a next line
        while (myFileReader.hasNextLine()) {
            // read the next line from the Scanner and store it in a String variable
            String line = myFileReader.nextLine();
            // print the String to the console
            System.out.println(line);
        }
    }
}

