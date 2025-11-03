// In this prog. input is taken from user of an array..and than print the array.

import java.util.Scanner;

class input_array{
    public static void main(String[] args) {
        
int arr[]=new int [5];

Scanner obj=new Scanner(System.in);
 System.out.print("enter 5 Elements:");
for(int i=0;i<=arr.length-1;i++){
   
arr[i]=obj.nextInt();

}
System.out.print("final result is:");
for(int i=0;i<=arr.length-1;i++){
    System.out.print(arr[i]+ " ");
}

    }
}