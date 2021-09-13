
import java.util.Arrays;

public class MainProgram {
    
    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        
        for (int num : array) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int smallestNum = array[0];
        
        int indexSmallest = 0;
        int index = 0;
        for (int num : array) {
            if (array[index] < smallestNum) {
                smallestNum = array[index];
                indexSmallest = index;
            }
            index++;
        }
        return indexSmallest;
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallestNum = array[startIndex];
        int indexSmallest = startIndex;
        
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < smallestNum) {
                smallestNum = array[i];
                indexSmallest = i;
            }
        }
        return indexSmallest;
        
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int num1 = array[index1];
        int num2 = array[index2];
        
        array[index1] = num2;
        array[index2] = num1;
        
    }
    
    public static void sort(int[] array) {
        int[] arr = array;
        
        for (int i = 0; i < array.length; i++) {
            int indexSmallestFrom = indexOfSmallestFrom(arr, i);
            swap(arr, i, indexSmallestFrom);
        }
        
    }
    
}
