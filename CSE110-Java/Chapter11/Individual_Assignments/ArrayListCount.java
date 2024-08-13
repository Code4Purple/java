package Summer2024.Chapter11.Individual_Assignments;
import java.util.ArrayList;


public class ArrayListCount {
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
        System.out.println(count(TestList, 2)); // Expected output: 3
        System.out.println(count(TestList, 99)); // Expected output: 0

    }

    public static int count(ArrayList<Integer> list, int num) {
        // Your code here
        int count = 0;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == num) {
                count++;
            }
        }
        return count;
    }
}
