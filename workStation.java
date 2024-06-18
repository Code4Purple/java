public class workStation {
   public static int calculateCost(int age, int units) {
      int cost;
      if (age >= 15 && age < 28) {
         if (units > 17) {
            cost = (units - 17) * 100; 
         }
         else {
            cost = 0;
         }
      }
      else {
         if (units < 14) {
            cost = units * 100;
         }
         else {
            cost = (units - 13) * 500 + 400;
         }
      }
      return cost;
   }
    
   public static void main(String[] args) {
      int costReturned = calculateCost(16, 3);
      System.out.println(costReturned);
   }
}
