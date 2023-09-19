import java.util.Scanner;

public class TemperatureStats {
  public static void main(String[] args) {
    // declare and instantiate a Scanner 
    Scanner scan = new Scanner(System.in);
    // prompt for and collent inputs
    System.out.print("Enter first Temperature  : ");
    double temp1 = scan.nextDouble();
    System.out.print("Enter second Temperature : ");
    double temp2 = scan.nextDouble();
    System.out.print("Enter third Temperature  : ");
    double temp3 = scan.nextDouble();
    System.out.print("Enter fourth Temperature : ");
    double temp4 = scan.nextDouble();

    // compute the required information
        // Sub-Min Finder
    double subMin1 = Math.min(temp1, temp2);
    double subMin2 = Math.min(temp3, temp4);
        // Sub-Max Finder
    double subMax1 = Math.max(temp1, temp2);
    double subMax2 = Math.max(temp3, temp4);

    double min = Math.min(subMin1, subMin2);
    double max = Math.max(subMax1, subMax2);
    double average = (temp1 + temp2 + temp3 + temp4) / 4;
    double range = max - min;
    double midpoint = max - (range / 2);
    double skew = ((average - midpoint) / range) * 100; // % convert

    // output the require results
    System.out.printf("Min     : %.1f\n", min);
    System.out.printf("Max     : %.1f\n", max);
    System.out.printf("Average : %.1f\n", average);
    System.out.printf("Skew    : %.1f%%\n", skew);
    System.out.printf("Range   : %.1f\n", range);
  }
}
