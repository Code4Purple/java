class Bunny {
   // make no changes to these field declarations
   public String name;
   public int age;
   
   // define the overloaded constructor method below
   public Bunny(String name, int age) {
      this.name = name;
      this.age = age;
   }
   
   // make no other changes to this code
   public void print() {
      System.out.println(" (\\(\\   ");
      System.out.println(" (-.-)    ");
      System.out.println(" O_(\")(\") ");
      System.out.printf("%s is %d years old.\n", this.name, this.age);
   }
}
