import java.io.IOException;
import java.util.ArrayList;

class Main {
   public static void main(String[] args) throws IOException {
      boolean isPassed = true;
      // testing the getAverage method
      System.out.println("Testing getAverage method");
      ArrayList<Double> arr = new ArrayList<Double>();
      for (int i = 1; i <= 5; i++) {
         arr.add((double) i);
      }
      if (getAverage(arr) != 3.0) {
         isPassed = false;
      }
      System.out.printf("Expected: 3.0 : Actual: %.1f : Passed? %b\n", getAverage(arr), isPassed);

      // testing the getMin method
      if (getMin(arr) != 1.0){
         isPassed = false;
      }
      System.out.println("\nTesting getMin method");
      System.out.printf("Expected: 1.0 : Actual: %.1f : Passed? %b\n", getMin(arr), isPassed);

      // testing the getMax method
      if (getMax(arr) != 5.0){
         isPassed = false;
      }
      System.out.println("\nTesting getMax method");
      System.out.printf("Expected: 5.0 : Actual: %.1f : Passed? %b\n", getMax(arr), isPassed);

      // Center Method
      System.out.println("\nTesting Center Data method");
      System.out.print("The Array before centering: ");
      for(int i = 0; i < arr.size(); i++){
         System.out.printf("%.1f ", arr.get(i));
      }
      System.out.println();
      arr = center(arr);
      System.out.print("The Array after  centering: ");
      for(int i = 0; i < arr.size(); i++){
         System.out.printf("%.1f ", arr.get(i));
      }
      System.out.println();

      // Scaled Method
      System.out.println("\nTesting Scale Data method");
      System.out.print("The Array before scaling: ");
      for(int i = 0; i < arr.size(); i++){
         System.out.printf("%.1f ", arr.get(i));
      }
      System.out.println();
      arr = scale(arr, 100);
      System.out.print("The Array after  scaling: ");
      for(int i = 0; i < arr.size(); i++){
         System.out.printf("%.1f ", arr.get(i));
      }
      System.out.println();


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

   public static ArrayList<Double> center(ArrayList<Double> arr){
      ArrayList<Double> centered = new ArrayList<Double>();
      // Subtracting the input value to ArrayList entries
      for (int i = 0; i < arr.size(); i++) {
         centered.add(( arr.get(i) - getAverage(arr) ) );
      }

      return centered;
   }

   public static ArrayList<Double> scale(ArrayList<Double> arr, int newRange){
      double currentRange = getMax(arr) - getMin(arr);
      double scale = newRange / currentRange;
      ArrayList<Double> scaled = new ArrayList<Double>();
      for (int i = 0; i < arr.size(); i++) {
         scaled.add(arr.get(i) * scale);
      }
      return scaled;
   }
}