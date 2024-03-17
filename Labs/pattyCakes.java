// Patty's Cakes - Lab 06

package Labs;

import java.util.Scanner;

public class pattyCakes {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Strings to help outs 
        String welcome = "Welcome to Patty's Cakes!\n";
        String howMany= "How many cupcakes would you like, 4 or 6? ";
        String errorSize = "Invalid selection, please try again.";
        int howManyCakes = 0;
        String passMsg = "Great! Let's start filling your %d-pack.";

        // Package Size Section
        System.out.println(welcome);
        while(howManyCakes != 4 || howManyCakes != 6){
            System.out.print(howMany);
            howManyCakes = input.nextInt();
            if(howManyCakes == 4 || howManyCakes == 6){
                System.out.println(String.format(passMsg, howManyCakes));
                break;
            }
            else{
                System.out.println(errorSize);
            }
        }

        // Select your Type of Cakes
        String menu = "\nCupcake Menu:\n";
        String vanilla = "Vanilla Delight: ";
        String chocolate = "Chocolate Dream:";
        String strawberry = "Strawberry Bliss:";
        String caramel = "Caramel Drizzle: ";
        // Prices
        double vanillaPrice = 2.50;
        double chocolatePrice = 3.00;
        double strawberryPrice = 2.75;
        double caramelPrice = 3.50;
        // Console Output
        for(int i = 0; i <= howManyCakes; i++){
            switch (i) {
                case 0:
                    System.out.print(menu);
                    i++;
                case 1:
                    //System.out.printf(i + ". " + vanilla + "$.2f" + vanillaPrice);
                    System.out.printf("%d. %s $%.2f\n", i, vanilla, vanillaPrice);
                    i++;
                case 2:
                    //System.out.println(i + ". " + chocolate + "$.2f" + chocolatePrice);
                    System.out.printf("%d. %s $%.2f\n", i, chocolate, chocolatePrice);
                    i++;
                case 3:
                    //System.out.printf(i + ". " + strawbeery + "$.2f" + strawberryPrice); 
                    System.out.printf("%d. %s $%.2f\n", i, strawberry, strawberryPrice);  
                    i++;
                case 4:
                    //System.out.printf(i + ". " + caramel + "$.2f" + caramelPrice);    
                    System.out.printf("%d. %s $%.2f\n", i, caramel, caramelPrice);
                    i++;
                default:
                    break;
                    //System.out.println("ERROR : MENU NOT FOUND");                   
            }
        }
        String selection ="";
        String userPrompt = "Select cupcake #";
        int caseNum = 0;
        for(int i = 1; i <= howManyCakes; i++){
            System.out.printf("%s%d: ", userPrompt, i );
            caseNum = input.nextInt();
            if(caseNum == 1){
                selection += "1";
            }
            else if(caseNum == 2){
                selection += "2";
            }
            else if(caseNum == 3){
                selection += "3";
            }
            else if(caseNum == 4){
                selection += "4";
            }
            else{
                System.out.println(errorSize);
                i = i - 1;
            }
        }

        // Receipt Section
        String title = "\nHere are the cupcakes in your pack:";
        double salesTax = 0.08;
        double preTax = 0;
        double afterTax = 0;

        String thanks = "Thank you for ordering from Patty's Cakes!";
        String spaceing = "   - ";
        // Print out the receipt
        int endIndex;
        
        System.out.println(title);
        for(int i = 0; i < selection.length(); i++){
        
            if(selection.charAt(i) == '1'){
                endIndex = vanilla.indexOf(":");
                System.out.printf("%s%s\n", spaceing ,vanilla.substring(0, endIndex));
                preTax += vanillaPrice;
            }   
            else if(selection.charAt(i) == '2'){
                endIndex = chocolate.indexOf(":");
                System.out.printf("%s%s\n", spaceing ,chocolate.substring(0, endIndex));
                preTax += chocolatePrice;
            }
            else if(selection.charAt(i) == '3'){
                endIndex = strawberry.indexOf(":");
                System.out.printf("%s%s\n", spaceing ,strawberry.substring(0, endIndex));
                preTax += strawberryPrice;
            }
            else if(selection.charAt(i) == '4'){
                endIndex = caramel.indexOf(":");
                System.out.printf("%s%s\n", spaceing ,caramel.substring(0, endIndex));
                preTax += caramelPrice;
            }
            else{
                System.out.println("ERROR: PRINT ERROR");
            }
        }
        String sales = "8% Sales Tax:";
        String total = "Total:";
        String salesTotal = "Sales Total:";
        afterTax = (preTax * salesTax) + preTax;

        System.out.printf("\n%s     $%.2f\n", salesTotal, preTax);
        System.out.printf("%s    $%.2f\n", sales,preTax * salesTax);
        System.out.printf("%s           $%.2f\n\n",total, afterTax);
        System.out.print(thanks);

    }
}
