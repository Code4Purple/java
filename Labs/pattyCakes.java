// Patty's Cakes - Lab 06

package Labs;

import java.util.Scanner;

public class pattyCakes {
    public static void main(String[] args) {
        // Input from user
        Scanner userInput = new Scanner(System.in);
        // Console messages
        String welcomeMsg = "Welcome to Patty's Cakes!";
        String howManyCakes = "How many cupcakes would you like, 4 or 6?";
        String errorMsg = "Invalid selection, please try again.";
        String startOrder = "Great! Let's start filling your ";
        // variables for the processing
        int cakes = 0;
        // Console output for the 1st Section
        System.out.println(welcomeMsg + "\n");
        while (cakes != 6 || cakes != 4) {
            System.out.print(howManyCakes + " ");
            cakes = userInput.nextInt();
            if (cakes == 6) {
                System.out.println(startOrder + "6-pack.");
                break;
            } else if (cakes == 4) {
                System.out.println(startOrder + "4-pack.");
                break;
            } else {
                System.out.println(errorMsg);
            }
        }
        
        // Menu Setup and Items names
        String menuTitle = "Cupcake Menu:";
        String villina = "Vanilla Delight";
        String chocolate = "Chocolate Dream";
        String strawberry = "Strawberry Bliss";
        String caramel = "Caramel Drizzle";
        // Prices
        double villinaPrice = 2.50;
        double chocolatePrice = 3.00;
        double strawberryPrice = 2.75;
        double caramelPrice = 3.50;
        // Printing the menu
        for(int start = 1; start < 5; start++){
            switch(start){
                case 1:
                    System.out.println(start + ". " + villina + ": $" + villinaPrice);
                    break;
                case 2:
                    System.out.println(start + ". " + chocolate + ": $" + chocolatePrice);
                    break;
                case 3:
                    System.out.println(start + ". " + strawberry + ": $" + strawberryPrice);
                    break;
                case 4:
                    System.out.println(start + ". " + caramel + ": $" + caramelPrice);
                    break;
                default:
                    break;
            }
        }
        
        // Getting the user's selection for the packs
        int i = 1;
        boolean villinaSelected = false;
        boolean chocolateSelected = false;
        boolean strawberrySelected = false;
        boolean caramelSelected = false;
        int villinaCount = 0;
        int chocolateCount = 0;
        int strawberryCount = 0;
        int caramelCount = 0;
        while(i < cakes){
            System.out.println("Select cupcake #" + i + ": ");
            int selection = userInput.nextInt();
            if(selection > 0 && selection < 5){
                i++;
                switch (selection) {
                    case 1:
                        villinaSelected = true;
                        villinaCount++;
                        break;
                    case 2:
                        chocolateSelected = true;
                        chocolateCount++;
                        break;
                    case 3: 
                        strawberrySelected = true;
                        strawberryCount++;
                        break;
                    case 4:
                        caramelSelected = true;
                        caramelCount++;
                        break;
                    
                    default:
                        villinaSelected = false;
                        chocolateSelected = false;
                        strawberrySelected = false;
                        caramelSelected = false;
                        break;
                }
            }
            else{
                System.out.println(errorMsg);
            }
        }
        // Receipt of the order
        String receiptTitle = "Here are the cupcakes in your pack:";
        String spaceing = "   - ";
        double totalPrice;
        double taxes = 0.08;
        double salesTotal;
        String thanksMsg = "Thank you for ordering from Patty's Cakes!";

        System.out.println(receiptTitle);
        for(int j = 1; j < cakes; j++){
            if(villinaSelected){
                System.out.println(spaceing + villina + " x" + villinaCount);
                break;
            }
            else if(chocolateSelected){
                System.out.println(receiptTitle);
                System.out.println(spaceing + chocolate + " x" + chocolateCount);
                break;
            }
            else if(strawberrySelected){
                System.out.println(receiptTitle);
                System.out.println(spaceing + strawberry + " x" + strawberryCount);
                break;
            }
            else if(caramelSelected){
                System.out.println(receiptTitle);
                System.out.println(spaceing + caramel + " x" + caramelCount);
                break;
            }
            else{
                System.out.println(errorMsg);
            }
        }
    }
}
