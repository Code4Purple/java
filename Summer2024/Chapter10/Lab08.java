package Chapter10;

public class Lab08 {
    public static void main(String[] args) {
        // Test Array
        int[] myArray = {1, 22, 333, 400, 5005, 9};
        System.out.println("Array: {1, 22, 333, 400, 5005, 9}");
        // Call getFirst method
        System.out.println("First element: " + getFirst(myArray));
        // Call getLast method
        System.out.println("Last element: " + getLast(myArray));
        // Call contains method
        System.out.println("Deos it Contain 400: " + contains(myArray, 400));
        // GetAll but the first element
        System.out.print("All but the first element: ");
        int[] printArray = getAllButFirst(myArray);
        for(int i = 0; i < printArray.length; i++){
            System.out.print(printArray[i] + " ");
        }
     }
     
    public static int getFirst(int [] numbers) {
        return numbers[0];
    }

    public static int getLast(int [] numbers) {
        return numbers[numbers.length - 1];
    }

    public static boolean contains(int [] Array, int searchValue) {
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] == searchValue) {
                return true;
            }
        }
        return false;
    }

    public static int[] getAllButFirst(int[] Array){
        int newArray[] = new int[Array.length - 1];
        for(int i = 0; i < newArray.length ; i++){
            // Skips the first element
            newArray[i] =  Array[i + 1];
        }
        return newArray;
    }    
}
