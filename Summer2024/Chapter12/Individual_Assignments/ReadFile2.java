package Summer2024.Chapter12.Individual_Assignments;

// This program should ask the user for the name of the file that they would like to display. 
// The program will then open the file with the user specified name, 
// and display the contents of that file to the console.
// 
// You must fill in the two missing pieces described in the code below.
// 1. you must write the getFileName method.
// 2. You must call the displayFileContents method from within the main method.
// 
// make no other changes to the code, and make no changes to any of the provided .txt files.

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

class Main {
    // use the scnr Scanner variable defined below to collect any user input
    public static Scanner scnr = new Scanner(System.in);
   
    public static void main(String[] args) throws IOException {
        String fileName = getFileName();
        
        /* 2) Call the displayFileContents method and pass the fileName as an argument */
        // Giving the space for the conolse to be more readable
        System.out.println();
        displayFileContents(fileName);

    }
    
    /* 1) Write a public static method named getFileName.
          This method should take no arguments.
          This method should prompt the user to enter a complete file name.
          This method should collect the user's input in a String variable.
          This method should return the value stored in the String variable. */
    public static String getFileName(){
        System.out.print("Enter the complete file name: ");
        String fileName = scnr.nextLine();
        return fileName;
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
