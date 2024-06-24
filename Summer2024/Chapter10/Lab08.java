package Chapter10;

public class Lab08 {
    public static void main(String[] args) {
        // Test Array
        int[] myArray = {1, 22, 333, 400, 5005, 9};
        // Call getFirst method
        int output = getFirst(myArray);
        System.out.println(output);
     }
     
    public static int getFirst(int [] numbers) {
        return numbers[0];
    }
}
