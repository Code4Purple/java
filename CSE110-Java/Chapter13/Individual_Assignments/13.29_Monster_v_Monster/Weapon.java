public class Weapon {
    private String name;
    private int maxDamage;

    public Weapon() {
        // Default constructor
        this.name = "Sword";
        this.maxDamage = 10;
    }
    
    public Weapon(String name, int maxWeaponDamage) {
        this.name = name;
        this.maxDamage = maxWeaponDamage;
    }

    public String getName() {
        return name;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }
}
