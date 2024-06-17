//package todo-project;
import java.util.Scanner;
import java.util.ArrayList;

public class ToDoList {
    public static void main(String[] args) {
        // Start of the Program
        System.out.println("Starting ToDo List Program...");
        printMenu();
        boolean isRunning = true;

        // Scanner for User Input
        Scanner input = new Scanner(System.in);
             
        // Public Vectors
        ArrayList<String> addTaksNameData = new ArrayList<>();
        ArrayList<String> addTaksDueData = new ArrayList<>();

        // Input & Main Menu
        while(isRunning){
            System.out.print("Enter a number for the menu option: ");
            int menuOption = input.nextInt();
            switch (menuOption) {
                case 0:
                    System.out.println("Exiting ToDo List Program...");
                    // Save and Exit - Code Here
                    isRunning = false;
                    break;
                case 1:
                    addTask(isRunning); // Passes Scanner to addTask
                    break;

                default:
                    System.out.println("Invalid Menu Option. Please try again.");
                    break;
            }
        }
        
    }

    public static void printMenu() {
        System.out.println("-----------------");
        System.out.println("    Main Menu    ");
        System.out.println("-----------------");
        System.out.println("  0. Save and Exit");
        System.out.println("  1. Add Task    ");
        System.out.println("  2. Check Off Task ");
        System.out.println("  3. View Over all Tasks  ");
        System.out.println("  4. View Completed Tasks ");
        System.out.println("  5. View Incomplete Tasks ");
        System.out.println("  6. Delete Task ");
        System.out.println("  7. Edit Titles of Checklists ");
    }

    public void addTask(boolean isRunning) {
        isRunning = true;
        Scanner input = new Scanner(System.in);

        while(isRunning){
            // Getting the Task Name
            System.out.println("Enter the Task (or type 'done' to finish): ");
            String taskName = input.nextLine();

            // Continue or Exit
            if(taskName.equalsIgnoreCase("done")) {
                isRunning = false;
                break;
            } 

            // Getting the Task Due Date
            System.out.printf("Due Date of %s: ", taskName);
            String taskDueDate = input.nextLine();

            // Feedback from console
            System.out.println("Task Added: " + taskName);

            // The Task is added to the List
            addTaksNameData.add(taskName);
            addTaksDueData.add(taskDueDate);

            
            
            
        }
    
    }  
}
