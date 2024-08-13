import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;

public class expenses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String response = "";
        
        System.out.print("Would you like to enter an expense? (yes/no): ");
        response = input.nextLine().toLowerCase(); // Use nextLine() for consistent input reading
        
        // Processes Expenses - Initial Declarations
        ArrayList<String> expenseListNames = new ArrayList<>();
        ArrayList<Double> expenseListAmounts = new ArrayList<>();
        
        // Collecting Expenses - Initial Declarations
        ArrayList<String> expenseListInput = new ArrayList<>();
        String expense = "";
        
        // Collects Expenses - Name & Amount 
        while(response.equals("yes") || response.equals("y")) {
            System.out.print("Enter an expense (or type 'done' to finish): ");
            expense = input.nextLine();
            
            if(expense.equalsIgnoreCase("done")) {
                break;
            } else {
                expenseListInput.add(expense);
            }
            /*
            System.out.print("Do you want to enter another expense? (yes/no): ");
            response = input.nextLine().toLowerCase();
            */
        }
        
        // Processes Expenses Inputs
        System.out.println("Processing Expenses...");
        int maxLoops = expenseListInput.size();
        
        for(int i = 0; i < maxLoops; i++) {
            // Gets the Expense from the Input ArrayList
            expense = expenseListInput.get(i);
            
            // Breaks the Name and Amount to Separate ArrayLists
            int space = expense.indexOf(" ");
            String expenseName = expense.substring(0, space);
            double expenseAmount = Double.parseDouble(expense.substring(space + 1));
            
            // Add to respective ArrayLists
            expenseListNames.add(expenseName);
            expenseListAmounts.add(expenseAmount); 
            
            // Prints out the Expense - Name and Amount
            System.out.printf("Name: %s Amount: $%.2f\n", expenseName, expenseAmount);

            // Output sizes for verification
            System.out.println("\nExpense List Inputs Size = " + expenseListInput.size());
            System.out.println("Expense List Name Size   = " + expenseListNames.size());
            System.out.println("Expense List Amount Size = " + expenseListAmounts.size());

        }
        
        // Determine the maximum length of expense names
        int maxLength = 0;
        for (String name : expenseListNames) {
            if (name.length() > maxLength) {
                maxLength = name.length();
            }
        }

        // Output the a summary of the expenses Entered
        String filePath = "expenses.txt"; // Define the file path where you want to create the file

        try {
            // Create FileWriter and BufferedWriter objects
            FileWriter fw = new FileWriter(filePath);
            BufferedWriter bw = new BufferedWriter(fw);

            // Titles of the Expense List - in the file
            String title2 = "    Bill(s)        Amount(s)";
            String title3 = "----------------------------------------------";
            bw.write(title3);
            bw.newLine();
            bw.write(title2);
            bw.newLine();
            bw.write(title3);
            bw.newLine();
            
            // Write each expense entry to the file
            for (int i = 0; i < expenseListNames.size(); i++) {
                String expenseName = expenseListNames.get(i);
                double expenseAmount = expenseListAmounts.get(i);
                
                // Dynamically add spaces to align the amounts
                StringBuilder line = new StringBuilder("  " + expenseName);
                for (int j = expenseName.length(); j < maxLength; j++) {
                    line.append(" ");
                }
                line.append("   $").append(String.format("%.2f", expenseAmount)).append("  ");
                
                bw.write(line.toString());
                bw.newLine(); // Write a new line after each entry
            }

            // Output the total of the expenses
            bw.write(title3);
            bw.newLine();
            double total = expenseListAmounts.stream().mapToDouble(Double::doubleValue).sum();
            String formattedTotal = String.format("%.2f", total);
            bw.write("     Total         $" + formattedTotal);
            bw.newLine();
            
            
            // Close the BufferedWriter
            bw.close();

            // Prints the File Path
            System.out.println("Data has been written to " + filePath);
        }
        catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // read the file and print the contents
           
        try {
            // Create a FileReader and BufferedReader for efficient reading
            FileReader fr = new FileReader(filePath); // use the same file path as above
            BufferedReader br = new BufferedReader(fr);
            
            String line;
            
            // Read each line until end of file (EOF)
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Process each line (you can do other operations here)
            }
            
            // Close resources
            br.close();
            fr.close();
        } catch (IOException e) {
            // Handle exceptions
            System.err.println("Error reading file: " + e.getMessage());
        }

        // Close scanner
        input.close();
    }
}
