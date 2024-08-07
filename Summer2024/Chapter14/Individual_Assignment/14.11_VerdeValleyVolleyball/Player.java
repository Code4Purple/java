public class Player {
    private String name;
    private double attackScore;
    private double blockScore;

    public Player(String name, double attackScore, double blockScore) {
        this.name = name;
        this.attackScore = attackScore;
        this.blockScore = blockScore;
    }

    public String getName() {
        return name;
    }

    public double getAttackScore() {
        return attackScore;
    }

    public void setAttackScore(double attackScore) {
        this.attackScore = attackScore;
    }

    public double getBlockScore() {
        return blockScore;
    }

    public void setBlockScore(double blockScore) {
        this.blockScore = blockScore;
    }

    public void printInfo() {
        System.out.println(name + " (attack = " + attackScore + ", block = " + blockScore + ")");
    }
}
