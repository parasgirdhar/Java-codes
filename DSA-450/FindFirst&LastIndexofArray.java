class Solution {
    public int[] searchRange(int[] nums, int target) {
 
 int first = -1;
 int last =-1;
 
 for(int i=0;i<nums.length;i++){
     if(nums[i]==target){
         if(first==-1){
             first=i;
         }
         last=i;
     }
 }
      return new int[]{first,last};
    }
}

// if target present return its first and last index if not than return -1,-1 if only one element is present of target than return same index of first as well as last......