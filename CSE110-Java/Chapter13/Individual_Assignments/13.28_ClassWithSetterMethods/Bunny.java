class Bunny {
   // make no changes to these field declarations
   private String name;
   private int age;
   
   // define the mutator (setter) methods below
   public void setName(String name){
      this.name = name;
   }

   public void setAge(int age){
      this.age = age;
   }
   
   // make no other changes to this code
   public void print() {
      System.out.println(" (\\(\\   ");
      System.out.println(" (-.-)    ");
      System.out.println(" O_(\")(\")");
      System.out.printf("%s is %d years old.\n", this.name, this.age);
   }
}
