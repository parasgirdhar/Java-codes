class Main{
    public static void main(String []args){
        
        int nums[]={7,5,4,2,8,6,1};
       
        int maxi=0;
        int mini=nums[0];
        
        for(int i=0;i<nums.length;i++){
            maxi=Math.max(nums[i],maxi);
            mini=Math.min(nums[i],mini);
        }
        System.out.println("This is max : "+ +maxi);
        System.out.println("This is min value : "+ +mini);
        
    }
}