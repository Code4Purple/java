package Chapter10.Individual_Assignment;

public class countGreaterThan {
    
    public static void main(String[] args) {
        // Test Array
        int[] myArray = {1, 22, 333, 400, 5005, 9};
        
        // Test For countGreaterThan
        System.out.println(countGreaterThan(myArray, 200));   
    }

    public static int countGreaterThan(int[] Array, int compareValue){
        int count = 0;
        for(int i = 0; i < Array.length; i++){
            if(Array[i] > compareValue){
                count++;
            }
        }
        return count;
    }
}
