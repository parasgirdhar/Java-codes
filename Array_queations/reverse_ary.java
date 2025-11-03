// In this prog. we reversed the given array...

class reverse_ary {
public static void main(String[] args) {
    

  int arr[]={93,56,67,89};

 System.out.print("normal array is:");
    for(int i=0;i<=arr.length-1;i++){
        System.out.print(arr[i]+ " ");
    }

  
System.out.print("\nreversed array is:");
for(int i=arr.length-1;i>=0;i--){
    System.out.print(arr[i]+ " ");
}


}
}
