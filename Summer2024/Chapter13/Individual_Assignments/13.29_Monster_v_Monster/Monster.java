
public class Monster {
    private String name;
    private int health;
    private Weapon weapon;

    /* 
    public Monster() {
        // Default constructor
        this.name = "Monster";
        this.health = 100;
        this.weapon = new Weapon();
    }
    */

    public Monster(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getWeaponName() {
        return this.weapon.getName();
    }

    public int attack(Monster monsterGettingAttacked) {
        // Getting weapon's damage for this turn
        double percentageOfDamge = Math.random() * weapon.getMaxDamage();
        int damageToInflicted = (int)(percentageOfDamge);
        
        // Inflicting damage to the monster
        int beforeTheAttack = monsterGettingAttacked.getHealth();
        int afterTheAttack = beforeTheAttack - damageToInflicted;
        
        // Looking At Troubeshoting
        /*System.out.printf("Monster Getting Attacked: %s\n", monsterGettingAttacked.getName());
        System.out.printf("Monster Getting Attacked Health: %d\n", monsterGettingAttacked.getHealth());
        System.out.printf("Monster Percentage of Damage: %.2f\n", percentageOfDamge);
        System.out.printf("Monster Damge to Inflict: %d\n", damageToInflicted);
        System.out.printf("Monster After Attack Health: %d\n", afterTheAttack); */
        //System.out.printf("Damage Inflicted: %d\n", inflictedDamage);

        // Setting the new health of the monster
        monsterGettingAttacked.health = afterTheAttack;
        return damageToInflicted;
    }
}
