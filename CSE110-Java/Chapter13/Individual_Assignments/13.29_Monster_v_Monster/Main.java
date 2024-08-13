public class Main {
    public static void main(String[] args) {
        Weapon sword = new Weapon("Sword", 10);
        Weapon pointyStick = new Weapon("Pointy Stick", 1);
        Monster monster1 = new Monster("Monster1", 100, pointyStick);
        Monster monster2 = new Monster("Monster2", 100, sword);
        
        //System.out.println("Monster2 Current Health = " + monster2.getHealth());
        
        //monster1.attack(monster2);
        //System.out.println("\nMonster2 Current Health = " + monster2.getHealth());
        

        
    }
}
