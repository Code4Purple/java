import java.util.Scanner;
 
public class ChangeMachine {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Change myChange = new Change();
 
        System.out.print("Enter whole dollars: ");
        myChange.dollarCount = scnr.nextInt();
 
        System.out.print("Enter number of quarters: ");
        myChange.quarterCount = scnr.nextInt();
 
        System.out.print("Enter number of dimes: ");
        myChange.dimeCount = scnr.nextInt();
 
        System.out.print("Enter number of nickels: ");
        myChange.nickelCount = scnr.nextInt();
 
        myChange.total = myChange.dollarCount 
                + 0.25 * myChange.quarterCount  
                + 0.10 * myChange.dimeCount  
                + 0.05 * myChange.nickelCount;
        
        System.out.println("You have: $" + myChange.total);
    }
}

class Change{
    int dollarCount;
    int quarterCount;
    int dimeCount;
    int nickelCount;
    double total;
}
