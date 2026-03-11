class main{
    public static void main(String []args){
        
        
        int arr[]={4,-7,2,-8,-9,0,4,1,0};
        
        int left=0;
        int right=arr.length-1;
        
        while(left<right){
            
            if(arr[left] >= 0){
                left++;
            }
            
            else if(arr[right] < 0){
                right--;
            }
            else{
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
            
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        
    }
}