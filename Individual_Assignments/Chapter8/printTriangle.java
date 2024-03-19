package Individual_Assignments.Chapter8;

import java.util.Scanner;

public class printTriangle {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the size    : ");
        int size = scan.nextInt();
        System.out.print("Enter a character : ");
        String character = scan.next();
        
        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(character.charAt(0));
            }
            System.out.println();
        }
    
    
    }
}
