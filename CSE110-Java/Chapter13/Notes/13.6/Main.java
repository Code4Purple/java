public class Main {        
   public static void main(String[] args) {
      Bunny myBunny = new Bunny(); // declare and instantiate a Bunny
         
      myBunny.age = 3; // store a value in the Bunny's age variable
      myBunny.name = "Flopsy"; // store a value in the Bunny's name variable
        
      // retrieve the values stored in the Bunny's variables
      System.out.println(myBunny.name + " is " + myBunny.age);
    }
}
 
// This class definition below creates a new data type named Bunny.
// We can now declare Bunny variables, and instantiate Bummy Objects.
// Each Bunny object will know its name and its age.
class Bunny {
   int age;
   String name;
}

