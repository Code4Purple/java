import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.PrintWriter;

class Main {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      ArrayList<Double> myData = null;

      // Collect data file name from user
      System.out.print("Enter data file name : ");
      String dataFileName = scnr.nextLine();

      // get the data from the file
      myData = loadData(dataFileName);
      // normalize the data
      normalize(myData);
      // outut the normalized data to the required file
      saveData(myData);
  }

   public static double getAverage(ArrayList<Double> arr) {
      double sum = 0;
      for (int i = 0; i < arr.size(); i++) {
         sum += arr.get(i);
      }
      return sum / arr.size();
   }

   public static double getMin(ArrayList<Double> arr){
      double min = arr.get(0);
      for (int i = 0; i < arr.size(); i++) {
         if (arr.get(i) < min) {
            min = arr.get(i);
         }
      }
      return min;
   }

   public static double getMax(ArrayList<Double> arr){
      double max = arr.get(0);
      for (int i = arr.size() - 1; i >= 0; i--) {
         if (arr.get(i) > max) {
            max = arr.get(i);
         }
      }
      return max;
   }

   public static void center(ArrayList<Double> arr){
      // Subtracting the input value to ArrayList
      ArrayList<Double> temp = new ArrayList<Double>();
      for (int i = 0; i < arr.size(); i++) {
         temp.add(( arr.get(i) - getAverage(arr)));
      }
      arr.clear();
      for(int i = 0; i < temp.size(); i++){
         arr.add(temp.get(i));
      }
   }
   
   public static void scale(ArrayList<Double> arr, double newRange){
      double currentRange = getMax(arr) - getMin(arr);
      double scale = newRange / currentRange;
      ArrayList<Double> temp = new ArrayList<Double>();
      for (int i = 0; i < arr.size(); i++) {
         temp.add(arr.get(i) * scale);
      }
      arr.clear();
      for(int i = 0; i < temp.size(); i++){
         arr.add(temp.get(i));
      }
   }
   
   public static void normalize(ArrayList<Double> arr){
      center(arr);
      scale(arr, 100);
   }
   
   public static ArrayList<Double> loadData(String fileName) throws IOException {
      ArrayList<Double> loading = new ArrayList<Double>();
      FileInputStream fileByteStream = null; // File input stream
      Scanner inFS = null;                   // Scanner object
      
      fileByteStream = new FileInputStream(fileName);
      inFS = new Scanner(fileByteStream);
      
      while(inFS.hasNext()){
         loading.add(inFS.nextDouble());
      }
      
      return loading;
   }
   
   public static void saveData(ArrayList<Double> arr) throws IOException{
      PrintWriter outFS = null; // PrintWriter object
      
      outFS = new PrintWriter("normal.dat");
      
      for(int i = 0; i < arr.size(); i++){
         outFS.printf("%.2f\n",arr.get(i));
      }
      
      outFS.close();
   }
}