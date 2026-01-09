import java.util.Scanner;

class Main{
    public static void main(String []args){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("your result is:");

       System.out.println(arr.length);
    }
}
