package Summer2024.Chapter12.Individual_Assignments;

// This program should ask the user for the name of the file that they would like to open.
// The program will then open the file with the user specified name,
// and total up the list of integers in the file.
// Input files will always have one integer on each line.
// There may be a different number of lines in each input file.

// You must fill in the missing piece described in the code below.
// 1) you must write the sumFileContents method.

// make no other changes to the code, 
// and make no changes to any of the provided .dat files.

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

class ReadFile3 {
    // The scnr Scanner variable defined below will be used to collect any user input
    public static Scanner scnr = new Scanner(System.in);
   
    public static void main(String[] args) throws IOException {
        String fileName = getFileName();
        
        int sum = sumFileContents(fileName);
        
        System.out.println("The sum is: " + sum);
    }
    
    public static String getFileName() {
        System.out.print("Enter file name: ");
        return scnr.nextLine();
    }
    
    /* 1) Write a public static method named sumFileContents.
          This method should take one String argument (a complete file name).
          This method should open the specified file.
          This method should read in all of the integers in the file and add each to a total.
          This method should return an int (the total of all integers in the file).
          Be sure to add the 'throws IOException' clause after the parameter list.*/
    
    public static int sumFileContents(String fileName) throws IOException{
        FileInputStream myFile = new FileInputStream(fileName);
        Scanner myFileReader = new Scanner(myFile);
        int sum = 0;

        while (myFileReader.hasNextLine()) {
            String reader = myFileReader.nextLine();
            int num = Integer.parseInt(reader);            
            sum += num;
        }
        myFileReader.close();
        return sum;
    }


}

