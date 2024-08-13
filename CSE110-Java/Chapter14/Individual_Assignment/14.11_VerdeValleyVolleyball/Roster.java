import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Roster {
    private ArrayList<Player> playerList;

    public Roster() {
        playerList = new ArrayList<>();
    }

    public Roster(String filename) {
        playerList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                String name = parts[0] + " " + parts[1];
                double attackScore = Double.parseDouble(parts[2]);
                double blockScore = Double.parseDouble(parts[3]);
                playerList.add(new Player(name, attackScore, blockScore));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addPlayer(String name, double attackScore, double blockScore) {
        playerList.add(new Player(name, attackScore, blockScore));
    }

    public int getPlayerCount() {
        return playerList.size();
    }

    public Player getPlayerByName(String name) {
        for (Player player : playerList) {
            if (player.getName().equals(name)) {
                return player;
            }
        }
        return null;
    }

    public void printTopAttackers() {
        playerList.stream()
            .sorted(Comparator.comparingDouble(Player::getAttackScore).reversed())
            .limit(2)
            .forEach(Player::printInfo);
    }

    public void printTopBlockers() {
        playerList.stream()
            .sorted(Comparator.comparingDouble(Player::getBlockScore).reversed())
            .limit(2)
            .forEach(Player::printInfo);
    }

    public void printAllPlayers() {
        for (Player player : playerList) {
            player.printInfo();
        }
    }
}
