package Individual_Assignments.Chapter8;

import java.util.Scanner;
public class removeSpaces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a some text : ");
        String input = scan.nextLine();
        String printString = "";
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) != ' '){
                printString += input.charAt(i);
            }
        }
        System.out.println("Output : " + printString);
    }
}
