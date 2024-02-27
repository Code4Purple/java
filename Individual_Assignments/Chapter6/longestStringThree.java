package Individual_Assignments.Chapter6;

import java.util.Scanner;
public class longestStringThree {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "";
        String str3 = "";

        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter first string  : ");
        str1 = scnr.nextLine();
        System.out.print("Enter second string : ");
        str2 = scnr.nextLine();
        System.out.print("Enter third string  : ");
        str3 = scnr.nextLine();

        if(str1.length() > str2.length() && str1.length() > str3.length()){
            System.out.println("\nThe longest is : " + str1);
        } else if(str2.length() > str1.length() && str2.length() > str3.length()){
            System.out.println("\nThe longest is : " + str2);
        } else if(str3.length() > str1.length() && str3.length() > str2.length()){
            System.out.println("\nThe longest is : " + str3);
        } 
        else {
            System.out.println("\nBoth have equal length");
        }
    }
}
