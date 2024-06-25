package Chapter10.Individual_Assignment;

public class printArray {
    public static void main(String[] args) {
        String space = ", ";
        int[] myArray = {1, 22, 333, 400, 5005, 9};
        printArray(myArray, space);
        space = " - ";
        printArray(myArray, space);
    }

    public static void printArray(int[] Array, String space){
        for(int i = 0; i < Array.length; i++){
            System.out.print(Array[i]);
            if(Array.length - 1 == i){
                break;
            }
            else{
                System.out.print(space);
            }
        }
        System.out.println();
    }
}
