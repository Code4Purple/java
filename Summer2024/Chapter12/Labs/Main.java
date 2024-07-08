import java.io.IOException;
import java.util.ArrayList;

class Main {
   public static void main(String[] args) throws IOException {
      boolean isPassed = true;
      // testing the getAverage method
      System.out.println("Testing getAverage method");
      ArrayList<Double> arr = new ArrayList<Double>();
      for (int i = 1; i <= 10; i++) {
         arr.add((double) i);
      }
      if (getAverage(arr) != 5.5) {
         isPassed = false;
      }
      System.out.printf("Expected: 5.5 : Actual: %.1f : Passed? %b\n", getAverage(arr), isPassed);

      // testing the getMin method
      if (getMin(arr) != 1.0){
         isPassed = false;
      }
      System.out.println("\nTesting getMin method");
      System.out.printf("Expected: 1.0 : Actual: %.1f : Passed? %b\n", getMin(arr), isPassed);

      // testing the getMax method
      if (getMax(arr) != 10.0){
         isPassed = false;
      }
      System.out.println("\nTesting getMax method");
      System.out.printf("Expected: 10.0 : Actual: %.1f : Passed? %b\n", getMax(arr), isPassed);
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
}