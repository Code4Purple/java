package Summer2024.Chapter12.Individual_Assignments;

// This program will read the contents of an input file (line by line);
// each line of the input file will have one integer value between 1 and 100.
// From the data in the input file, you must compute the
// sum, average, minimum, and maximum values.
// These values must then be printed to the console (terminal).

// You must fill in the missing piece described in the code below.
// 1) you must write the reportStatistics method.

// make no other changes to the code, 
// and make no changes to any of the provided .dat files.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter ;
import java.io.IOException;
import java.util.Scanner;

class StatisticsPrint {
    static Scanner scnr = new Scanner(System.in);
    // make no changes to this method
    public static void main(String[] args) throws IOException {
        String inputFileName = getFileName("Enter input file name  : ");
        
        reportStatistics(inputFileName);
    }
    
    // make no changes to this method
    public static String getFileName(String prompt) {
        System.out.print(prompt);
        return scnr.nextLine();
    }
    
    /* 1) Write a public static method named reportStatistics.
          Be sure to add the 'throws IOException' clause to the method header
          This method should take one String argument (an input file name).
          This method should have a return type of void.
          This method should read in all of the integers from the input file.
          This method should compute the sum (int), average (float), min (int) and max (int) values.
          from the data in the input file.
          This method should output these statistics to the console (terminal).
          The output should look like this (average should have two digits to the right of the decimal point):
             Sum is     : 45
             Average is : 5.00
             Min is     : 1
             Max is     : 9 
    */
    public static void reportStatistics(String fileName) throws IOException{
        int count = 0;
        int sum = 0;
        double average = 0;
        int min = 100;
        int max = 0;
        // read in all of the integers from the input file
        Scanner myFileReader = new Scanner(new FileInputStream(fileName));
        while(myFileReader.hasNextLine()){
            // 2) read the next line from the Scanner and store it in a String variable
            String reader = myFileReader.nextLine();
            int num = Integer.parseInt(reader);
            sum += num;
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
            count ++;
        }
        average = sum / (count * 1.0);
        myFileReader.close();

        // output thses statistics to the statistics.dat file
        PrintWriter myFileWriter = new PrintWriter(new FileOutputStream("statistics.dat"));
        myFileWriter.println("Sum is     : " + sum);
        myFileWriter.println("Average is : " + String.format("%.2f", average));
        myFileWriter.println("Min is     : " + min);
        myFileWriter.println("Max is     : " + max);
        myFileWriter.close();

        // output these statistics to the console (terminal)
        printFile("statistics.dat");
    }
   
    
    // make no changes to this method
    public static void printFile(String fileName) throws IOException {
       Scanner myFileReader = new Scanner(new FileInputStream(fileName));
         while (myFileReader.hasNextLine()) {
            System.out.println(myFileReader.nextLine());
        }

        myFileReader.close();
    }
}

