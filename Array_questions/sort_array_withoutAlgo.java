public class Sort012Simple {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0, 1, 0};
        sort012(arr);

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort012(int[] arr) {
        int low = 0;            // position for 0
        int mid = 0;            // current element
        int high = arr.length - 1; // position for 2

        while (mid <= high) {
            if (arr[mid] == 0) {
                // swap arr[low] and arr[mid]
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                // swap arr[mid] and arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
    }
}