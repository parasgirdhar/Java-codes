// In this prog. we take input size of array from user than enter elements in array than reverse it 
// and print output...


import java.util.Scanner;

class Input_ArrayReverse {
    
public static void main(String[] args) {

    System.out.println("enter your array size: ");

Scanner obj=new Scanner(System.in);
int s=obj.nextInt();
int arr[]=new int[s];

System.out.print("array of "+ s + " is created");

System.out.print("\nenter your " + s + " elements\n" );

for(int i=0;i<=arr.length-1;i++){
arr[i]=obj.nextInt();
}

System.out.print(" normal array is:");
for(int i=0;i<=arr.length-1;i++){
    System.out.print(arr[i]+ " ");
}

System.out.print("\nreversed array is:");
for(int i=arr.length-1;i>=0;i--){
    System.out.print(arr[i]+ " ");
}
}
}
