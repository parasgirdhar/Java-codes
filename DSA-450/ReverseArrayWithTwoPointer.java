
class Main{
    public static void main(String []args){
        
        int arr[]={2,3,4,6,7};
        
        int start= 0;
        int end = arr.length-1;
        
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]= temp;
            
            start++;
            end --;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}



// With method type and in Two pointer.......


class Main{
    
    public static int[] Arr(int arr[]){
        
        int start=0;
        int end = arr.length-1;
        
        while(start<end){
            int temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            
            start++;
            end--;
        }
        
        return (arr);
    }
    public static void main(String []args){
        int arr[]={3,4,5,6,7,8};
        
      int res [] =  Arr(arr);
        
        for(int i=0;i<res.length;i++){
            System.out.print(res[i] + " ");
        }
    }
}