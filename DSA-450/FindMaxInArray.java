
// find maximum in an array ...............


class Main{
    
    public static int maxRet(int arr [] , int max){
        
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
        return max;
    }
    
    public static void main(String []args){
        
        int arr[]={5,6,3,1,9,7,76,4};
        int max=0;
        
        maxRet(arr,max);
    }
}