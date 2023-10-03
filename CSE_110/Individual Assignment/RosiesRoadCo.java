
public class RosiesRoadCo {
    public static void main(String[] args) {
      // write code here to call and test your method before you submit for grading
      System.out.println(numberOfStoplights(1.0,  1));   // should return the value 3
      System.out.println(numberOfStoplights(1.0,  2));   // should return the value 4
      System.out.println(numberOfStoplights(2.0,  1));   // should return the value 6
      System.out.println(numberOfStoplights(2.75,  3));  // should return the value 10 */
    }
    
    // write your required method here below
    /*public static void printHighwayInfo(){

    } */

    public static int numberOfStoplights(double miles, int lanes) {
      // Use the values stored in the miles and lanes parameter variables
      // to calculate the total number of stoplights needed.
         double stoplightsPerIntersection = 2 + lanes; 
         double numberOfIntersections = Math.floor(miles) * 2;
         int totalStoplights = (int)(stoplightsPerIntersection * numberOfIntersections);

      // Then return (not print) that calculated value.
         return totalStoplights;
  
  }
    
    
 }