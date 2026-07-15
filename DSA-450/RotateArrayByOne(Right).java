// Rotate array into right by one ....

class Main {
    public static int [] Rotate(int arr[]){
      int temp=arr[arr.length-1];
      for(int i=arr.length-2;i>=0;i--){
          arr[i+1]=arr[i];
      }
      arr[0]=temp;
      return arr;
    }
    public static void main(String[] args) {
      int arr[]={1,2,34,67,8,90,45};
      
      int res[]=Rotate(arr);
      
      for(int i=0;i<res.length;i++){
          System.out.println(res[i]);
      }
    }
}


// output => 45 1 2 34 67 8 90 
