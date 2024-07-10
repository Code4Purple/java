package Summer2024.Chapter11.Individual_Assignments;
import java.util.ArrayList;

public class GetAllOdd {
    public static void main(String[] args) {
        // Test ArrayList
        ArrayList<Integer> TestList = new ArrayList<Integer>();
        TestList.add(3);
        TestList.add(2);
        TestList.add(7);
        TestList.add(5);
        TestList.add(8);
        TestList.add(6);
        // Test the getAllOdd method
        System.out.print("Original List: ");
        printArrayList(TestList, ", ");
        System.out.print("Odd List     : ");
        printArrayList(getAllOdd(TestList), ", ");

    }   
    
    public static ArrayList<Integer> getAllOdd(ArrayList<Integer> list) {
        ArrayList<Integer> oddList = new ArrayList<Integer>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) %2 != 0){
                oddList.add(list.get(i));
            }
        }
        return oddList;
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
