public class CallAirplane {
   public static void main(String[] args) {
      Airplane airbus330 = new Airplane();

      airbus330.addPassengers(3);
      airbus330.addPassengers(8);

      System.out.println(airbus330.getAvailableSeats() + " seats");
   }
}