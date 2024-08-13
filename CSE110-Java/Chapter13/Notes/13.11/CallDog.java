import java.util.Scanner;

public class CallDog {
    public static void main(String [] args) {
        Dog buddy = new Dog();
        
        Scanner input = new Scanner(System.in);
        int weight = input.nextInt();
        int age = input.nextInt();

        buddy.setWeightAndAge(weight, age);
        System.out.print("Human years: " + buddy.getHumanYears());

        input.close();
  
    }
}