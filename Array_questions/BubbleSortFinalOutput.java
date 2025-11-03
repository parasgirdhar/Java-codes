//In these we have an normal array 
// and we sort it and print output....


import java.util.Arrays;

public class BubbleSortFinalOutput {
    public static void main(String[] args) {
        int[] arr = {23, 45, 32, 76, 98, 56, 9, 34, 65};

        System.out.println("Original array: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // Print final sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
