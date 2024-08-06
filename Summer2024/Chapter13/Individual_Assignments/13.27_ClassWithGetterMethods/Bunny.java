class Bunny {
   // make no changes to these field declarations
   private String name;
   private int age;
   
   // make no changes to this constructor method
   public Bunny(String initName, int initAge) {
      this.name = initName;
      this.age = initAge;
   }
   
   // define the accessor (getter) methods below
   public int getAge() {
      return age;
   }

  public String getName() {
      return name;
  }
   
   // make no other changes to this code
   public void print() {
      System.out.println(" (\\(\\   ");
      System.out.println(" (-.-)    ");
      System.out.println(" O_(\")(\") ");
      System.out.printf("%s is %d years old.\n", this.name, this.age);
   }
}
