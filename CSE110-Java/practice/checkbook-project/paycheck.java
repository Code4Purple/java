import java.util.ArrayList;
import java.util.Scanner;

public class paycheck {
        
    public static void main (String[] args){
        // Start Menu
        Scanner input = new Scanner(System.in);
        String response = "";
        System.out.print("Would you like to enter a paycheck? (yes/no): ");
        response = input.nextLine().toLowerCase();

        // What Month is this?
        System.out.print("What month is this will these paychecks come from? : ");
        String month = input.nextLine();

        // Initialize ArrayLists
        ArrayList<String> paycheckDates = new ArrayList<>();
        ArrayList<Double> paycheckAmounts = new ArrayList<>();

        // Collect Paychecks
        while(response.equals("yes") || response.equals("y")) {
            System.out.print("Enter a the paycheck data then the paycheck amount (or type 'done' to finish): ");
            String paycheck = input.nextLine();
            
            if(paycheck.equalsIgnoreCase("done")) {
                break;
            } else {
                int space = paycheck.indexOf(" ");
                String paycheckDate = paycheck.substring(0, space);
                double paycheckAmount = Double.parseDouble(paycheck.substring(space + 1));
                
                paycheckDates.add(paycheckDate);
                paycheckAmounts.add(paycheckAmount);
            }
        }

        // Process Paychecks
        System.out.println("Processing Paychecks...");
        int maxLoops = paycheckDates.size();
        for(int i = 0; i < maxLoops; i++) {
            String paycheckDate = paycheckDates.get(i);
            double paycheckAmount = paycheckAmounts.get(i);
            System.out.printf("Date: %s Amount: $%.2f\n", paycheckDate, paycheckAmount);
        }
        
        
        

        // Close Scanner
        input.close();
    }
}
