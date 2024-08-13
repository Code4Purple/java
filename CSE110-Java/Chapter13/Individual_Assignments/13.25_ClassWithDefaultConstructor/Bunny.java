class Bunny {
   // make no changes to these field declarations
   public String name;
   public int age;
   
   // define the defualt constructor method below
   public Bunny() {
      //defualt constructor
      this.name = "Mopsy";
      this.age = 7;
   }
   
   // make no other changes to this code
   public void print() {
      System.out.println(" (\\(\\   ");
      System.out.println(" (-.-)    ");
      System.out.println(" O_(\")(\") ");
      System.out.printf("%s is %d years old.\n", this.name, this.age);
   }
}
