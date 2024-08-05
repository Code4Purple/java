//package Chapter13.Individual_Assignments.Basic_Bunny;


public class Main {
    public static void main(String[] args) {
        Bunny bugs = makeBunny("Bugs", 3);
        displayInfo(bugs);
    }

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
}
