package Chapter10.Individual_Assignment;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {1, 22, 333, 400, 5005, 9};
        
        // Test For printArray
        String space = ", ";
        System.out.print("The array is: ");
        printArray(myArray, space);

        // Test For countGreaterThan
        int compareValue = 200;
        System.out.println("The number of elements greater than " + compareValue + " is " + countGreaterThan(myArray, compareValue));

        // Test For countLessThan
        compareValue = 200;
        System.out.println("The number of elements less than " + compareValue + " is " + countLessThan(myArray, compareValue));

        // Test For getIndexOfMin
        int[] myArray2 = {333, 22, 1,  400, 5005, 9};
        System.out.println("The index of the minimum value is " + getIndexOfMin(myArray2));

        // Test For getIndexOfMax
        System.out.println("The index of the maximum value is " + getIndexOfMax(myArray2));

        // Test for getAllButLast
        System.out.print("All but the last element: ");
        printArray(getAllButLast(myArray), space);

        // Test for getInRange
        System.out.print("The elements in the range 100 to 1000 are: ");
        printArray(getInRange(myArray, 100, 1000), space);
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

    public static int countGreaterThan(int[] Array, int compareValue){
        int count = 0;
        for(int i = 0; i < Array.length; i++){
            if(Array[i] > compareValue){
                count++;
            }
        }
        return count;
    }

    public static int countLessThan(int[] Array, int compareValue){
        int count = 0;
        for(int i = 0; i < Array.length; i++){
            if(Array[i] < compareValue){
                count++;
            }
        }
        return count;
    }

    public static int getIndexOfMin(int[] Array){
        int min = Array[0];
        int index = 0;
        for(int i = 1; i < Array.length; i++){
            if(Array[i] < min){
                min = Array[i];
                index = i;
            }
        }
        return index;
    }

    public static int getIndexOfMax(int[] Array){
        int max = Array[0];
        int index = 0;
        for(int i = 1; i < Array.length; i++){
            if(Array[i] > max){
                max = Array[i];
                index = i;
            }
        }
        return index;
    }

    public static int[] getAllButLast(int[] myArray){
        int[] newArray = new int[myArray.length - 1];
        for(int i = 0; i < myArray.length - 1; i++){
            newArray[i] = myArray[i];
        }
        return newArray;
    }

    public static int[] getInRange(int[] Array, int low, int high){
        int count = 0;
        for(int i = 0; i < Array.length; i++){
            if(Array[i] >= low && Array[i] <= high){
                count++;
            }
        }
        int[] newArray = new int[count];
        int index = 0;
        for(int i = 0; i < Array.length; i++){
            if(Array[i] >= low && Array[i] <= high){
                newArray[index] = Array[i];
                index++;
            }
        }
        return newArray;
    }
}
