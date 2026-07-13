
// Multiply all the elements of array by 10 and return new multiplied array......


class Main{
    
    public static int[] Arr(int arr[]){
        
        int nums[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            nums[i] = arr[i]*10;
            System.out.println(nums[i]);
            
        }
        return nums;
    }
    
    public static void main(String []args){
        int arr[]={2,4,6,8};
        
        int res[] = Arr(arr);
    }
}





