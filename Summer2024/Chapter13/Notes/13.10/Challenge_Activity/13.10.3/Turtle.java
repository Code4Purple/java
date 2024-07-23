public class Turtle {

    // Declare instance variables
    private String name;
    private String color;
    private int age;
   
   public int getAge(){
      return age;
   }
   
   public String getName(){
      return name;
   }
   
   public String getColor(){
      return color;
   }

	public void setAge(int customAge) {
		age = customAge;
	}

	public void setName(String customName) {
		name = customName;
	}

	public void setColor(String customColor) {
		color = customColor;
	}
}
