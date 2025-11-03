// In this prog..  we take input from user that how much size of an  
// array user want than enter elements in array and print final output...

import java.util.Scanner;

class size_ary {
public static void main(String[] args) {
    
int r;

Scanner obj=new Scanner(System.in);
System.out.println("enter the size of array");
 r=obj.nextInt();
 int arr[]=new int[r];

System.out.println("array is created & the size is "+r);

System.out.println("now enter your " + r + (" elements"));

for(int i=0;i<=arr.length-1;i++){
 arr[i]=obj.nextInt();
}

System.out.print("your final array is: ");
for(int i=0;i<=arr.length-1;i++){
    System.out.print(+ arr[i]+ " ");
}

}    
}
