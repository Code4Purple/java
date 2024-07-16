package Summer2024.Chapter11.Individual_Assignments;

import java.util.ArrayList;

public class CountInList {
    public static void main(String[] args) {
        ArrayList<Integer> testList = new ArrayList<Integer>();
        ArrayList<Integer> testList2 = new ArrayList<Integer>();

        testList.add(1);
        testList.add(2);
        testList.add(1);
        testList.add(3);
        testList.add(2);
        testList.add(5);
        testList.add(6);
        testList.add(2);
        testList.add(4);

        testList2.add(1);
        testList2.add(2);
        testList2.add(3);

        System.out.println(countInList(testList, testList2));
    }
    
    public static int countInList(ArrayList<Integer> list, ArrayList<Integer> list2) {
        int count = 0;
        for(int i =0; i < list.size(); i++) {
            if(list2.contains(list.get(i))) {
                count++;
            }
        }
        return count;
    }
}
