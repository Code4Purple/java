package Summer2024.Chapter11.Individual_Assignments;

import java.util.ArrayList;
public class PrintArrayList {
    public static void main(String[] args) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        // Filling the array up quickly
        for(int i = 1; i < 7; i++) {
            list.add(i);
        }
        // Tetsing the printArrayList method
        printArrayList(list, ", ");
        printArrayList(list, " - ");

    }

    public static void printArrayList(ArrayList<Integer> list, String spacer) {
        // Your code here
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if(i != list.size() - 1) {
                System.out.print(spacer);
            }
        }
        System.out.println();
    }
}