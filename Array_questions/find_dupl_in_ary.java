class duplicate_ary{
public static void main(String[] args) {
    
int arr[]={2,3,4,6,6,8,3,9,9};
System.out.print("this values are duplicate:\n");
for(int i=0;i<=arr.length-1;i++){
    for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
            System.out.println( arr[i]);
        }
    }
}

}
}