public class Main {
   public static void main(String[] args) {
      Bunny myBunny = new Bunny("Flopsy", 2);
      Bunny yourBunny = new Bunny("Benny", 9);
      
      System.out.println("My Bunny's name is " + myBunny.getName());
      System.out.println("Your Bunny's name is " + yourBunny.getName());
      
      System.out.println("My Bunny's age is " + myBunny.getAge());
      System.out.println("Your Bunny's age is " + yourBunny.getAge());
   }
}
