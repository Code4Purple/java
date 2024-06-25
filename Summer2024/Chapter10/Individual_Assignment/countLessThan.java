

public class countLessThan {
    public static void main(String[] args) {
        // Test Array
        int[] myArray = {1, 22, 333, 400, 5005, 9};
        System.out.println(countLessThanNum(myArray, 200));
        System.out.println(countLessThanNum(myArray, 1));
    }

    public static int countLessThanNum(int[] Array, int compareValue){
        int count = 0;
        for(int i = 0; i < Array.length; i++){
            if(Array[i] < compareValue){
                count++;
            }
        }
        return count;
    }
}