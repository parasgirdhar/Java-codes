// check whether given array is sorted or not ...

class Main{
    public static void main(String []args){
        
        int arr[]={2,5,6,7,54,91};
        
        int count = 0;
        for(int i=0;i<arr.length-1;i++){
            
            if(arr[i]>arr[i+1]){
                count++;
                System.out.println("unsorted");
                break;
            }
        }
       if(count==0){
           System.out.println("sorted");
       }
    }
}



// With method type ...........

class Main{
    
    public static void Check(int arr[]){
        int count = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                count++;
                System.out.println("unsorted");
                break;
            }
        }
        if(count==0){
            System.out.println("sorted");
        }
        return;
    }
    
    public static void main(String []args){
        int arr[]={3,4,5,6,8,9,12,55,78};
        
        Check(arr);
    }
}

