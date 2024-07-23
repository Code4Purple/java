
public class Main1 {
   public static void main(String[] args) {
      Bunny myBunny = new Bunny(); // declare and instantiate a Bunny
		
      myBunny.age = 3; // store a value in the bunny's age variable
      myBunny.name = "Flopsy"; // store a value in the bunny's name variable
 
      myBunny.hop(); // make this bunny hop
		
      // feed the bunny
      myBunny.eat("carrots");
      myBunny.eat("cheeseburger");
      myBunny.eat("lettuce");
 
      // make this bunny take a nap
      myBunny.sleep();
    }
}


// This class definition below creates a new data type named Bunny.
// We can now declare Bunny variables, and instantiate Bummy Objects.
// Each Bunny object will know its name and its age.
// Each Bunny can hop, eat, adn sleep.
class Bunny {
   int age;
   String name;
 
   void hop() {
      System.out.println(name + " hops around.");
   }
 
   void eat(String food) {
      System.out.println(name + " eats the " + food + ".");
   }
 
   void sleep() {
         System.out.println(name + " takes a nap.");
   }
}
