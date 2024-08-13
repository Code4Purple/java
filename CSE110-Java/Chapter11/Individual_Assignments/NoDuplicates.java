package Summer2024.Chapter11.Individual_Assignments;
import java.util.ArrayList;

public class NoDuplicates {
    public static void main(String[] args) {
        // Test ArrayList
        ArrayList<Integer> TestList = new ArrayList<Integer>();
        TestList.add(5);
        TestList.add(3);
        TestList.add(1);
        TestList.add(2);
        TestList.add(3);
        TestList.add(3);
        // Test the noDuplicates method ( 2 Tests )
        System.out.print("Original List          : ");
        printArrayList(TestList, ", ");
        System.out.print("No Duplicates List     : ");
        printArrayList(noDuplicates(TestList), ", ");

        TestList.clear();
        TestList.add(1);
        TestList.add(1);
        TestList.add(5);
        TestList.add(5);
        TestList.add(3);
        TestList.add(3);
        System.out.print("Original List          : ");
        printArrayList(TestList, ", ");
        System.out.print("No Duplicates List     : ");
        printArrayList(noDuplicates(TestList), ", ");
    }

    public static ArrayList<Integer> noDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> noDuplicatesList = new ArrayList<Integer>();
        for(int i = 0; i < list.size(); i++){
            if(!noDuplicatesList.contains(list.get(i))){
                noDuplicatesList.add(list.get(i));
            }
        }
        return noDuplicatesList;
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
