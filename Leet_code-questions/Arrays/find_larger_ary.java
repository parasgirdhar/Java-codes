// find larger value in an array....

 class find_larger_ary {
    
 public static void main(String[]args){

int nums[]={3,2,6,7,8,-67,4,67,34};
int larger=Integer.MIN_VALUE;  // It i assumed as very smallest value like -infinity...

for(int i=0;i<=nums.length-1;i++){
    if(nums[i]>larger){
        larger=nums[i];
    }
}
System.out.print(larger);

    }
}
