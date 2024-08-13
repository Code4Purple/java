//package Chapter13.Individual_Assignments.Basic_Bunny;


public class Main {
    
    public static Bunny makeBunny(String name, int age){
        Bunny bunny = new Bunny();
        bunny.name = name;
        bunny.age = age;
        return bunny;

        //return new Bunny();
    }

    public static void displayInfo(Bunny bunny){
        // Output
        String output = "%s is a %d year old bunny.";
        System.out.printf(output, bunny.name, bunny.age);
    }

    public static void haveBirthday(Bunny bunny){
        bunny.age++;
    }

    public static void changeName(Bunny bunny, String newName){
        bunny.name = newName;
    }

    public static void feed(Bunny bunny, String appetizer, String mainCourse, String dessert){
        bunny.eat(appetizer);
        bunny.eat(mainCourse);
        bunny.eat(dessert);
    }

    public static void play(Bunny bunny){
        bunny.hop();
        bunny.eat("lettuce");
        bunny.eat("carrots");
        bunny.sleep();
    }
}
