import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class ClimateZone {
    private ArrayList<City> cityList;

    public ClimateZone() {
        cityList = new ArrayList<>();
    }

    public ClimateZone(String filename) {
        cityList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                String name = parts[0];
                String state = parts[1];
                double highTemp = Double.parseDouble(parts[2]);
                double lowTemp = Double.parseDouble(parts[3]);
                cityList.add(new City(name, state, highTemp, lowTemp));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addCity(String name, String state, double highTemp, double lowTemp) {
        cityList.add(new City(name, state, highTemp, lowTemp));
    }

    public int getCityCount() {
        return cityList.size();
    }

    public City getCityByName(String name, String state) {
        for (City city : cityList) {
            if (city.getName().equals(name) && city.getState().equals(state)) {
                return city;
            }
        }
        return null;
    }

    public void printHottestCities() {
        cityList.stream()
            .sorted(Comparator.comparingDouble(City::getHighTemp).reversed())
            .limit(2)
            .forEach(City::printInfo);
    }

    public void printColdestCities() {
        cityList.stream()
            .sorted(Comparator.comparingDouble(City::getLowTemp))
            .limit(2)
            .forEach(City::printInfo);
    }

    public void printAllCities() {
        for (City city : cityList) {
            city.printInfo();
        }
    }
}
