// this is normal program not optimized way...

public class SumProduct {
    public static void main(String[] args) {

        int sum = 0;
        int product = 1;
        int arr[] = {1, 2, 3, 4};

        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
            product=product*arr[i];
        }

        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
    }
}
