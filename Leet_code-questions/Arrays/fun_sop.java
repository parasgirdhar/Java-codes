// this is a method type sum and product without direct type...

public class fun_sop {

    static int[] sop(int arr[], int sum , int product) {
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
            product = product * arr[i];
        }
        return new int[]{sum, product}; // returning both values
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int sum = 0;
        int product = 1;

        int result[] = sop(arr, sum, product);

        System.out.println("Sum = " + result[0]);
        System.out.println("Product = " + result[1]);
    }
}
