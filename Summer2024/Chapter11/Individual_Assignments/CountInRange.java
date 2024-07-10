package Summer2024.Chapter11.Individual_Assignments;
import java.util.ArrayList;

public class CountInRange {
    public static void main(String[] args) {
        // Test ArrayList
        ArrayList<Integer> TestList = new ArrayList<Integer>();
        //TestList = {1, 2, 1, 3, 2, 5, 6, 2, 4}
        TestList.add(1);
        TestList.add(2);
        TestList.add(1);
        TestList.add(3);
        TestList.add(2);
        TestList.add(5);
        TestList.add(6);
        TestList.add(2);
        TestList.add(4);
        // Testing the count method
        System.out.println(countInRange(TestList, 1, 6)); // should return 9
        System.out.println(countInRange(TestList, 2, 4));   // should return 5
        System.out.println(countInRange(TestList, 10, 20)); // should retrun 0
    }  
    public static int countInRange(ArrayList<Integer> list, int min, int max) {
        // Your code here
        int count = 0;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) >= min && list.get(i) <= max) {
                count++;
            }
        }
        return count;
    }  
}
