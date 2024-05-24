import java.util.Scanner;
public class processingQ {
    public static void main(String[] args) {
      String name1;
      String name2;

      name1 = "Layla";
      name2 = "Lucy";

      System.out.printf("%-8s|\n", name1);
      System.out.printf("%-8s|\n", name2);

      double value = 46.0;
      String scientificNotation = String.format("%e", value);
      System.out.println(scientificNotation + "%");
    }
}