class Main{
    public static void main(String []args){
        
        int first = -1;
        int last = -1;
        int target = 7;
        
        int arr[]={2,3,4,5,7,7,7,7,8,9};
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                first = i;
                break;
            }
        }
        
        for(int i=arr.length-1;i>=1;i--){
            if(arr[i]==target){
                last = i;
                break;
            }
        }
        System.out.println("first is "+ + first);
        System.out.println("last is "+ + last);
        
    }
}