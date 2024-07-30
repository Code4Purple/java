//package Chapter13.Lab;

public class Main {
      
    public static void testkitty(int testID){
        switch (testID) {
            case 1:
                //System.out.println("Test 1: Default Constructor");
                Kitty kitty = new Kitty();
                String defualtName = kitty.getName();
                int defaultAge = kitty.getAge();
                if(defaultAge == 0 && defualtName.equals("Kitty")){
                    System.out.println("Default Constructor Test Passed");
                }else{
                    System.out.println("Default Constructor Test Failed");
                }
                break;
            case 2:
                //System.out.println("Test 2: Parameterized Constructor");
                Kitty kitty2 = new Kitty("Fluffy", 5);
                String name = kitty2.getName();
                int age = kitty2.getAge();
                if(age == 5 && name.equals("Fluffy")){
                    System.out.println("Parameterized Constructor Test Passed");
                }else{
                    System.out.println("Parameterized Constructor Test Failed");
                }
                break;
            case 3:
                //System.out.println("Test 3: Meow Method");
                Kitty kitty3 = new Kitty("Mario", 2);
                String meow = kitty3.meow();
                if(meow.equals("2 year old Mario says 'Meow!'")){
                    System.out.println("Meow Method Test Passed");
                }else{
                    System.out.println("Meow Method Test Failed");
                }
                break;
        
            default:
                System.out.println("Invalid Test ID");
                break;
        }
    }

    public static void main(String[] args){
        for (int i = 1; i <= 3; i++) {
            testkitty(i);
        }
    }
}
