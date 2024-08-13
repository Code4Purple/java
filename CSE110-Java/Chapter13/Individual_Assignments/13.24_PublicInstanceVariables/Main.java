public class Main {
   public static void main(String[] args) {
      Bunny myBunny = new Bunny();
      Bunny yourBunny = new Bunny();
      
      myBunny.name = "Fwuffy";
      myBunny.age = 3;
      
      yourBunny.name = "Flopsy";
      yourBunny.age = 5;
      
      myBunny.print();
      yourBunny.print();
   }
}
