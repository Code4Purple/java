;//import java.util.Scanner;

public class callWorkStation {
    public static void main(String[] args) {
        workStation commuterBike = new workStation();
  
        commuterBike.print();
        
        commuterBike.setYear(1925);
        commuterBike.setType("fitness");
        
        commuterBike.print();
     }
  }