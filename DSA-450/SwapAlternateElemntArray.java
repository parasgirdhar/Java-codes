

//  Swap Alternate element in an array ........... output  =>  4,3,6,5,8,7


class Main{
    public static void main(String []args){
        
        int arr[]={3,4,5,6,7,8};
        
        for(int i=0;i<arr.length-1;i=i+2){
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
        }
}


// with method type .........

class Main{
    
    public static int[] SwapArray(int arr[]){
        for(int i=0;i<arr.length-1;i=i+2){
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        return arr;
    }
    
    
    public static void main(String []args){
        int arr[]={2,3,4,5,6,7};
        
        int fetch []= SwapArray(arr);
    }
}