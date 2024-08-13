import java.util.Scanner;

public class TurtleData {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Turtle turtle1 = new Turtle();
      int inputAge;
		String inputName;
      String inputColor;

      inputAge = scnr.nextInt();
		inputName = scnr.next();
      inputColor = scnr.next();

      turtle1.setAge(inputAge);
		turtle1.setName(inputName);
      turtle1.setColor(inputColor);

      System.out.println("Age: " + turtle1.getAge());
		System.out.println("Name: " + turtle1.getName());
      System.out.println("Color: " + turtle1.getColor());
   }
}
